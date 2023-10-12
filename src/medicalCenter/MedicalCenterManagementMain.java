package medicalCenter;

import java.util.Scanner;

public class MedicalCenterManagementMain {
    static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
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
            }

        }


    }

    private static void printAllPatients() {
    }

    private static void printAllPatientsByDoctor() {
    }

    private static void addPatient() {
        
    }

    private static void changeDoctorById() {
        System.out.println("Please choose doctor id for change data`s");
        doctorStorage.print();
        System.out.println("Please input doctor id for change data`s");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.changeDoctorById(doctorId);
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
        System.out.println("Doctors data`s are updated");

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
        doctorStorage.searchDoctorByProfession(doctorProfession);

    }

    private static void addDoctor() {

        System.out.println("Please input the ID for DOCTOR");
        String doctorId = scanner.nextLine();
        System.out.println("Please input the name of DOCTOR");
        String doctorName = scanner.nextLine();
        System.out.println("Please input the surname of DOCTOR");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please input the email of DOCTOR");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please input the phoneNumber of DOCTOR");
        String doctorPhoneNumber = scanner.nextLine();
        System.out.println("Please input the profession of DOCTOR");
        String doctorProfession = scanner.nextLine();
        Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorEmail, doctorPhoneNumber, doctorProfession);
        doctorStorage.addDoctor(doctor);

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
