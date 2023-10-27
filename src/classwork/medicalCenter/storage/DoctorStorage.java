package classwork.medicalCenter.storage;

import classwork.medicalCenter.exception.PersonNotFoundException;
import classwork.medicalCenter.model.Doctor;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int size;

    public Doctor getById(String doctorId) throws PersonNotFoundException {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return doctors[i];
            }
        }
//        return null;
        throw new PersonNotFoundException("Doctor with: "+doctorId+" does not found");
    }

    public Doctor searchDoctorByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(doctorProfession)) {
                return doctors[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
    }


    public void addDoctor(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    public void deleteDoctorById(String doctorId) {
        int indexById = getIndexById(doctorId);
        if (indexById == -1) {
            System.out.println("doctor does not exists");
            return;
        }
        for (int i = indexById+1; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                doctors[i - 1] = doctors[i];
            }
        }
        size--;
    }

    private int getIndexById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return i;
            }
        }
        return -1;
    }

    public Doctor changeDoctorById(String doctorId) {
            for (int i = 0; i < size; i++) {
                if (doctors[i].getId().equals(doctorId)) {
                    return doctors[i];
                }
            }
            return null;
    }
}
