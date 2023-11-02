package onlineShop;

import onlineShop.enums.PaymentMethod;
import onlineShop.enums.ProductsType;
import onlineShop.enums.UserAdminType;
import onlineShop.model.Order;
import onlineShop.model.Product;
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
        User userAdmin = userStorage.getUserEmail(userEmail);
        if (userAdmin != null) {
            System.out.println("User with this EMAIL and password already exists");
            return;
        }
        System.out.println("Please input password ");
        String userPassword = scanner.nextLine();
//        String id = UUIdUtil.generateId();
        System.out.println("Please input ID");
        String userId = scanner.nextLine();
        User userFromStorage = userStorage.getById(userId);
        if (userFromStorage != null) {
            System.out.println("User or Admin with ID: " + userId + " does exists");
            return;
        }
        System.out.println("Please input name ");
        String userName = scanner.nextLine();
        System.out.println("Please input 'USER' or 'ADMIN'");
        String userType = scanner.nextLine().toUpperCase();
        UserAdminType type = userStorage.getType(userType);
        if (type == null) {
            System.out.println("Please input only ADMIN or USER");
            return;
        }
        User user = new User(userId, userName, userEmail, userPassword, type);
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

//            adminCommands();

                userCommands();

        } else {
            System.out.println("Incorrect Email or PASSWORD, please try again!");
        }
    }

    private static void userCommands() {
        boolean isRun = true;
        while (isRun) {
            Command.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case PRINT_ALL_PRODUCTS:
                    printProducts();
                    break;
                case BUY_PRODUCT:
                    buyProduct();
                    break;
                case PRINT_MY_ORDERS:
                    break;
                case CANCEL_ORDER_BY_ID:
                    break;
                default:
                    System.out.println("Incorrect command!!!");
            }
        }
    }

    private static void buyProduct() {
        System.out.println("Please input product ID");
        String productId = scanner.nextLine();
        Product productFromStorage = productStorage.getById(productId);
        if (productFromStorage == null) {
            System.out.println("Products with ID: " + productId + " does not exists");
            return;
        }
        System.out.println("Please input product quantity");
        int productQuantity = 0;
        try {
            productQuantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.println("Please input payment method(CARD,CASH,PAYPAL)");
        String paymentMethod = scanner.nextLine().toUpperCase();
        PaymentMethod payment = orderStorage.getType(paymentMethod);
        if (payment == null) {
            System.out.println("Please input CARD,CASH or PAYPAL");
            return;
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
                    removeProductById();
                    break;
                case PRINT_PRODUCTS:
                    printProducts();
                    break;
                case PRINT_USERS:
                    printUsers();
                    break;
                case PRINT_ORDERS:
                    printOrders();
                    break;
                case CHANGE_ORDER_STATUS:
                    break;
                default:
                    System.out.println("Invalid command!!!");
            }
        }

    }

    private static void printOrders() {
        orderStorage.print();
    }

    private static void printUsers() {
        userStorage.printOnlyUsers();
    }

    private static void printProducts() {
        productStorage.print();
    }

    private static void removeProductById() {
        System.out.println("Please input product ID for DELETE");
        String productId = scanner.nextLine();
        productStorage.removeProduct(productId);
    }

    private static void addProduct() {
        System.out.println("Please input product ID");
        String productId = scanner.nextLine();
        Product productFromStorage = productStorage.getById(productId);
        if (productFromStorage == null) {
            System.out.println("Products with ID: " + productId + " does not exists");
            return;
        }
        System.out.println("Please input product Name");
        String productName = scanner.nextLine();
        System.out.println("Please write the description");
        String description = scanner.nextLine();
        System.out.println("Please input product price");
        double productPrice = 0;
        try {
            productPrice = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.println("Please input product quantity");
        int productQuantity = 0;
        try {
            productQuantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        System.out.println("Please input Product(ELECTRONICS, CLOTHING or BOOKS)");
        String productType = scanner.nextLine().toUpperCase();
        ProductsType type = productStorage.getType(productType);
        if (type == null) {
            System.out.println("Please input only ELECTRONICS, CLOTHING or BOOKS");
            return;
        }
        Product product = new Product(productId, productName, description, productPrice, productQuantity, type);
        productStorage.addProducts(product);
        productStorage.print();
    }

}
