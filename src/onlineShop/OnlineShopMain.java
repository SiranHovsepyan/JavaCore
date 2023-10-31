package onlineShop;

import onlineShop.enums.ProductsType;
import onlineShop.enums.UserAdminType;
import onlineShop.model.User;
import onlineShop.storage.OrderStorage;
import onlineShop.storage.ProductStorage;
import onlineShop.storage.UserStorage;
import onlineShop.util.UUIdUtil;

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
        System.out.println("Please input email ");
        String userEmail = scanner.nextLine();
        System.out.println("Please input password ");
        String userPassword = scanner.nextLine();
        User userAdmin = userStorage.getUserEmailPassword(userEmail, userPassword);
        if (userAdmin != null && userPassword != null) {
            System.out.println("User with this EMAIL and password already exists");
            return;
        }

        String id = UUIdUtil.generateId();
        System.out.println("Please input name ");
        String userName = scanner.nextLine();
        System.out.println("Please input 'USER' or 'ADMIN'");
        String userType = scanner.nextLine().toUpperCase();
        UserAdminType type = userStorage.getType(userType);
        if (type == null) {
            System.out.println("Please input only ADMIN or USER");
            return;
        }
        User user = new User(id, userName, userEmail, userPassword, type);
        userStorage.addUserOrAdmin(user);
        userStorage.print();
    }

    private static void login() {
        System.out.println("Please input email ");
        String userEmail = scanner.nextLine();
        System.out.println("Please input password ");
        String userPassword = scanner.nextLine();
        User userAdmin = userStorage.getUserEmailPassword(userEmail, userPassword);
        if (userAdmin != null && userPassword != null) {

            adminCommands();
        } else {
            System.out.println("Incorrect Email or PASSWORD, please try again!");
        }
    }

    private static void adminCommands() {
        boolean isRun = true;
        while (isRun) {
            Command.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case ADD_PRODUCT:
                    addProduct();
                    break;
                case REMOVE_PRODUCT_BY_ID:
                    break;
                case PRINT_PRODUCTS:
                    break;
                case PRINT_USERS:
                    break;
                case PRINT_ORDERS:
                    break;
                case CHANGE_ORDER_STATUS:
                    break;
                default:
                    System.out.println("Invalid command!!!");
            }
        }

    }

    private static void addProduct() {
        System.out.println("Please input Product(ELECTRONICS, CLOTHING or BOOKS)");
        String productType = scanner.nextLine().toUpperCase();
        ProductsType type = productStorage.getType(productType);
    }

}
