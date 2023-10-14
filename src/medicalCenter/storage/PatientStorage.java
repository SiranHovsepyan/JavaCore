package medicalCenter.storage;

import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;

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


    public void addPatient(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;

    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if(patients[i].getDoctor().equals(doctor)){
                System.out.println(patients[i]);
            }

        }

    }
}
