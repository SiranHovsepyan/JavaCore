package medicalCenter;

import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;
import medicalCenter.storage.DoctorStorage;
import medicalCenter.storage.PatientStorage;

import java.text.ParseException;
import java.util.Scanner;

public class MedicalCenterManagementMain {
    static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            printAllCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addDoctor();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctorById();
                    break;
                case "4":
                    changeDoctorById();
                    break;
                case "5":
                    addPatient();
                    break;
                case "6":
                    printAllPatientsByDoctor();
                    break;
                case "7":
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
        Doctor doctorFormStorage = doctorStorage.getById(doctorId);
        if (doctorFormStorage == null) {
            System.out.println("Doctor with " + doctorId + " does not exists");
            return;
        }
        patientStorage.printAllPatientsByDoctor(doctorFormStorage);
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
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("DOCTOR with " + doctorId + " does not exists");
            return;
        }
        System.out.println("Please input date time(dd-MM-yyyy)");
        String registerDateTime = scanner.nextLine();
        Patient patient = new Patient(patientId, patientName, patientSurname, patientPhone, registerDateTime, doctorFromStorage);
        patientStorage.addPatient(patient);
        System.out.println("Patient created!");
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
        System.out.println("Doctor is deleted!!!");
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
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage != null) {
            System.out.println("Doctor with ID" + doctorId + " does exists");
            return;
        }
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
        Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorEmail, doctorPhoneNumber, doctorProfession);
        doctorStorage.addDoctor(doctor);
        System.out.println("Doctor created!");

    }

    private static void printAllCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD DOCTOR");
        System.out.println("Please input 2 for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input 3 for DELETE DOCTOR BY ID");
        System.out.println("Please input 4 for CHANGE DOCTOR BY ID");
        System.out.println("Please input 5 for ADD PATIENT");
        System.out.println("Please input 6 for PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("Please input 7 for PRINT ALL PATIENTS");
    }
}
