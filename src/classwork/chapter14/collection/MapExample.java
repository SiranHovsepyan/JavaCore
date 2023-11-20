package classwork.chapter14.collection;

import onlineShop.enums.UserAdminType;
import onlineShop.model.User;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
//        Map<String, User> myMap = new HashMap<>();
//        myMap.put("poxos@mail.ru", new User("poxos", "poxosyan", "poxs@mail.ru", "ddd", UserAdminType.USER));
//        myMap.put("petros@mail.ru", new User("poxos", "poxosyan", "poxs@mail.ru", "ddd", UserAdminType.USER));
//
//        User user = myMap.get("poxos@mail.ru");
//        System.out.println(user);


        Map<String, User> myMap = new HashMap<>();
        myMap.put("poxos@mail.ru", new User("poxos", "poxosyan", "poxs@mail.ru", "ddd", UserAdminType.USER));
        myMap.put("petros@mail.ru", new User("poxos", "poxosyan", "poxs@mail.ru", "ddd", UserAdminType.USER));
        myMap.put("martiros@mail.ru", new User("poxos", "poxosyan", "poxs@mail.ru", "ddd", UserAdminType.USER));

//        for (String key : myMap.keySet()) {
//            System.out.println(key + "->" + myMap.get(key));
//        }
//        for (User value : myMap.values()) {
//            System.out.println(value);
//        }

        for (Map.Entry<String, User> stringUserEntry : myMap.entrySet()) {
            System.out.println(stringUserEntry.getKey() + " -> " + stringUserEntry.getValue());

        }
    }
}
