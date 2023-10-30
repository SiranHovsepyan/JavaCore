package onlineShop;

import onlineShop.enums.UserAdminType;
import onlineShop.model.User;
import onlineShop.storage.OrderStorage;
import onlineShop.storage.ProductStorage;
import onlineShop.storage.UserStorage;

import java.util.Scanner;

import static onlineShop.Command.*;

public class OnlineShopMain {
    private static Scanner scanner = new Scanner(System.in);
    private static OrderStorage orderStorage = new OrderStorage();
    private static ProductStorage productStorage = new ProductStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Command.printLoginCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command!!!");
            }
        }

    }

    private static void register() {
        System.out.println("Please input id for USER");
        String userId = scanner.nextLine();
        System.out.println("Please input name for USER");
        String userName = scanner.nextLine();
        System.out.println("Please input email for USER");
        String userEmail = scanner.nextLine();
        System.out.println("Please input password for USER");
        String userPassword = scanner.nextLine();
        System.out.println("Please input 'USER' if you USER or input 'ADMIN' if you ADMIN");
        UserAdminType userType = UserAdminType.valueOf(scanner.nextLine().toUpperCase());
        User user = new User(userId, userName, userEmail, userPassword, userType);
        UserStorage.addUserOrAdmin(user);
        System.out.println(user);

    }

    private static void login() {

    }

}
