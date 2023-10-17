package medicalCenter.model;


import medicalCenter.util.DateUtil;
import java.util.Date;
import java.util.Objects;

public class Patient extends Person {
    private Date registerDateTime;
    private Doctor doctor;

    public Patient(String id, String name, String surname, String phoneNumber, Date registerDateTime, Doctor doctor) {
        super(id, name, surname, phoneNumber);
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public Patient() {
    }

    public Patient(Date registerDateTime, Doctor doctor) {
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient patient)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(registerDateTime, patient.registerDateTime))
            return false;
        return Objects.equals(doctor, patient.doctor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (registerDateTime != null ? registerDateTime.hashCode() : 0);
        result = 31 * result + (doctor != null ? doctor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "registerDateTime='" + DateUtil.dateTimeToString(registerDateTime) + '\'' +
                ", doctor=" + doctor +
                "} " ;
    }
}
