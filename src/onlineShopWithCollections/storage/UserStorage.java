package onlineShopWithCollections.storage;

import onlineShopWithCollections.enums.UserAdminType;
import onlineShopWithCollections.model.User;

public class UserStorage {
    private User[] users = new User[10];
    private int size;

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
    }


    public void addUserOrAdmin(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public void printOnlyUsers() {
        for (int i = 0; i < size; i++) {
            if (users[i].getType() == UserAdminType.USER) {
                System.out.println(users[i].getType());
            }
            System.out.println("USERS doesn`t exists");
        }
    }

    public UserAdminType getType(String userType) {
        if (userType.equals(UserAdminType.ADMIN.name()) ||
                userType.equals(UserAdminType.USER.name())) {
            return UserAdminType.valueOf(userType);
        }
        return null;
    }

    public User getUserEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }


    public User getUserEmailPassword(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

    public User getById(String userId) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(userId)) {
                return users[i];
            }
        }
        return null;
    }


}
