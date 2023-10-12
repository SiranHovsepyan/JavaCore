package medicalCenter;

public class Patient extends Person{
    private String registerDateTime;
    private Doctor doctor;

    public Patient(String id, String name, String surname, String phoneNumber, String registerDateTime, Doctor doctor) {
        super(id, name, surname, phoneNumber);
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public Patient() {
    }

    public Patient(String registerDateTime, Doctor doctor) {
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
