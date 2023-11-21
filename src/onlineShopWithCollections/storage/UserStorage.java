package onlineShopWithCollections.storage;

import onlineShopWithCollections.enums.UserAdminType;
import onlineShopWithCollections.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    Map<String, User> users = new HashMap<>();

    public void addUserOrAdmin(User user) {
        users.put(user.getEmail(), user);
    }

    public void print() {
        for (User users : users.values()) {
            System.out.println(users);
        }
    }

    public void printOnlyUsers() {
        for (User onlyUser : users.values()) {
            if (onlyUser.getType() == UserAdminType.USER) {
                System.out.println(onlyUser);
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
        for (User userEmail : users.values()) {
            if (userEmail.getEmail().equals(email)) {
                return userEmail;
            }
        }
        return null;
    }


    public User getUserEmailPassword(String email, String password) {
        for (User userEmailPassword : users.values()) {
            if (userEmailPassword.getEmail().equals(email) && userEmailPassword.getPassword().equals(password)) {
                return userEmailPassword;
            }
        }
        return null;
    }

    public User getById(String userId) {
        for (User byUserId : users.values()) {
            if (byUserId.getId().equals(userId)){
                return byUserId;
            }
        }
        return null;
    }


}
