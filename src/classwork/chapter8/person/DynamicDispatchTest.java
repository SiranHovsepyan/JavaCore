package classwork.chapter8.person;

public class DynamicDispatchTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Student student = new Student();
        sendEmail(employee);
        sendEmail(student);
    }

    public static void sendEmail(Person person) {
        System.out.println("send emeil" + person.getEmail());
    }
}
