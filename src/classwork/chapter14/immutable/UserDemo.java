package classwork.chapter14.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDemo {
    public static void main(String[] args) {
        Map<User,Integer> userAttempt= new HashMap<>();


        List<String> langList = new ArrayList<>();
        langList.add("Arm");
        langList.add("Ru");
        User user = new User("poxos","ssss","d@mail.ro","1234",langList);
        System.out.println(user);
        System.out.println(user.hashCode());
//        user.getName().split(" ");

        userAttempt.put(user,1);
        langList.add("Eng");
        System.out.println(userAttempt.get(user));
        user.getLanguageList().add("Eng");

//        System.out.println(user);

//        System.out.println(user.hashCode());
    }
}
