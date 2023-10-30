package onlineShop.storage;

import onlineShop.model.User;

public class UserStorage {
   private static User[] users = new User[10];
   private static int size;

    private static void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
    }


    public static void addUserOrAdmin(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    public static void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }
}
