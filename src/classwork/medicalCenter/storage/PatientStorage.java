package classwork.medicalCenter.storage;

import classwork.medicalCenter.model.Doctor;
import classwork.medicalCenter.model.Patient;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size;

    public Patient getById(String patientId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(patientId)) {
                return patients[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    private void extend() {
        Doctor[] tmp = new Doctor[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
    }

    public Doctor searchPatientByDoctorId(Doctor doctorId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctorId)) {
                return patients[i].getDoctor();
            }
        }
        return null;
    }

    public void deletePatientByDoctorId(Doctor doctorId) {
        searchPatientByDoctorId(doctorId);
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(searchPatientByDoctorId(doctorId))) {
                patients[i] = patients[i + 1];
            }
        }
        size--;
    }


    public void addPatient(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;

    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctor)) {
                System.out.println(patients[i]);
            }

        }

    }
}
