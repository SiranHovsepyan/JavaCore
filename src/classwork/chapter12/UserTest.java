package classwork.chapter12;

public class UserTest {
    public static void main(String[] args) {
//        String lang ="Ru";
//        Language language = Language.valueOf(lang);
//        User user =new User("Poxos","Poxosyan","Poxos@mail.com",Language.Hy);
//        User user1 =new User("Petros","Petrosyan","Petros@mail.com",language);
//
//        System.out.println(user1);
//        String lang = user.getLang().name();
//        System.out.println(lang);

        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value + " " + value.getLanguageName());
        }

    }
}
