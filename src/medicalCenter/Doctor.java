package medicalCenter;

public class Doctor extends Person{
    private String email;
    private String profession;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String profession) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    public Doctor(String email, String profession) {
        this.email = email;
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return super.toString() +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'';
    }
}
