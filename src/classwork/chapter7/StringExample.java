package classwork.chapter7;

public class StringExample {
    public static void main(String[] args) {
        String name = "Poxos ";
        String name1 = "POXOS";
        String nameLower = name.toLowerCase();
        String nameUpper = name.toUpperCase();
        System.out.println(nameUpper);
        System.out.println(nameLower);
        System.out.println(name.toLowerCase().equals(name1.toLowerCase()));
        boolean a = name.startsWith("Po");
        System.out.println(a);
        System.out.println(name.contains("os"));
        if (name.isEmpty()) {
            System.out.println("name is empty");
        }

        String replaceName = name.replace(" ", " * ");
        System.out.println(replaceName);
        String name2 = "Poxos Poxosyan Poxosi";
        String[] splitName2 = name2.split(" ");
        if (splitName2.length==3){
            String name3 = splitName2[0];
            String surname = splitName2[1];
            String middleName = splitName2[2];
            System.out.println(name3);
            System.out.println(surname);
            System.out.println(middleName);
        }

    }
}
