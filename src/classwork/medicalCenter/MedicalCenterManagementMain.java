package classwork.medicalCenter;


import classwork.medicalCenter.exception.PersonNotFoundException;
import classwork.medicalCenter.model.Doctor;
import classwork.medicalCenter.model.Patient;
import classwork.medicalCenter.storage.DoctorStorage;
import classwork.medicalCenter.storage.PatientStorage;
import classwork.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterManagementMain implements Commands {
    static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printAllCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    printAllPatients();
                    break;
                default:
                    System.out.println("Invalid command. Try again!!!");
                    break;
            }
        }
    }

    private static void printAllPatients() {
        patientStorage.print();
    }

    private static void printAllPatientsByDoctor() {
        System.out.println("Please choose DOCTOR");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctorFormStorage = null;
        try {
            doctorFormStorage = doctorStorage.getById(doctorId);
            patientStorage.printAllPatientsByDoctor(doctorFormStorage);
        } catch (PersonNotFoundException e) {
            throw new RuntimeException(e);
        }
//        if (doctorFormStorage == null) {
//            System.out.println("Doctor with " + doctorId + " does not exists");
//            return;
//        }

    }

    private static void addPatient() {
        System.out.println("Please input ID for PATIENT");
        String patientId = scanner.nextLine();
        Patient patientFromStorage = patientStorage.getById(patientId);
        if (patientFromStorage != null) {
            System.out.println("Patient with ID " + patientId + " does exists");
            return;
        }
        System.out.println("Please input name of PATIENT");
        String patientName = scanner.nextLine();
        System.out.println("Please input surname of PATIENT");
        String patientSurname = scanner.nextLine();
        System.out.println("Please input phoneNumber of  PATIENT");
        String patientPhone = scanner.nextLine();
        System.out.println("Please choose DOCTOR with doctorId");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = null;
        try {
            doctorFromStorage = doctorStorage.getById(doctorId);
            System.out.println("Please input register date Time(dd-MM-yyyy hh:mm)");
            String registerDateTimeStr = scanner.nextLine();
            Date registerDateTime = null;
            try {
                registerDateTime = DateUtil.stringToDateTime(registerDateTimeStr);
            } catch (ParseException e) {
                System.out.println("Date is incorrect!");
            }

            Patient patient = new Patient(patientId, patientName,
                    patientSurname, patientPhone, registerDateTime, doctorFromStorage);
            patientStorage.addPatient(patient);
            System.out.println("Patient created!");
        } catch (PersonNotFoundException e) {
            throw new RuntimeException(e);
        }
//        if (doctorFromStorage == null) {
//            System.out.println("DOCTOR with " + doctorId + " does not exists");
//            return;
//        }

    }

    private static void changeDoctorById() {
        System.out.println("Please choose doctor id for change data`s");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.changeDoctorById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with ID " + doctorId + " does not exists");
            return;
        }
        System.out.println("Please input the  new name of DOCTOR");
        String doctorName = scanner.nextLine();
        System.out.println("Please input the new surname of DOCTOR");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please input the new email of DOCTOR");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please input the new phoneNumber of DOCTOR");
        String doctorPhoneNumber = scanner.nextLine();
        System.out.println("Please input the new profession of DOCTOR");
        String doctorProfession = scanner.nextLine();
        doctorFromStorage.setName(doctorName);
        doctorFromStorage.setSurname(doctorSurname);
        doctorFromStorage.setEmail(doctorEmail);
        doctorFromStorage.setPhoneNumber(doctorPhoneNumber);
        doctorFromStorage.setProfession(doctorProfession);
        System.out.println("Doctors data`s  updated");

    }

    private static void deleteDoctorById() {
        System.out.println("Please input doctor id for delete");
        String doctorId = scanner.nextLine();
        doctorStorage.deleteDoctorById(doctorId);
        Doctor doctor = null;
        try {
            doctor = doctorStorage.getById(doctorId);
            while (patientStorage.searchPatientByDoctorId(doctor) != null) {
                patientStorage.deletePatientByDoctorId(doctor);
            }
            System.out.println("Doctor with patients deleted!!!");
        } catch (PersonNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input the doctor profession for search");
        String doctorProfession = scanner.nextLine();
        Doctor doctorProfFromStorage = doctorStorage.searchDoctorByProfession(doctorProfession);
        if (doctorProfFromStorage == null) {
            System.out.println("Doctor with profession " + doctorProfession + " does not exists");
            return;
        }
        System.out.println(doctorStorage.searchDoctorByProfession(doctorProfession));
    }

    private static void addDoctor() {
        System.out.println("Please input ID for DOCTOR");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = null;
        try {
            doctorFromStorage = doctorStorage.getById(doctorId);
            System.out.println("Please input name of DOCTOR");
            String doctorName = scanner.nextLine();
            System.out.println("Please input surname of DOCTOR");
            String doctorSurname = scanner.nextLine();
            System.out.println("Please input  email of DOCTOR");
            String doctorEmail = scanner.nextLine();
            System.out.println("Please input  phoneNumber of DOCTOR");
            String doctorPhoneNumber = scanner.nextLine();
            System.out.println("Please input  profession of DOCTOR");
            String doctorProfession = scanner.nextLine();
            Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorEmail,
                    doctorPhoneNumber, doctorProfession);
            doctorStorage.addDoctor(doctor);
            System.out.println("Doctor created!");

        } catch (PersonNotFoundException e) {
            throw new RuntimeException(e);
        }
//        if (doctorFromStorage != null) {
//            System.out.println("Doctor with ID " + doctorId + " does exists");
//            return;
//        }


    }

}
