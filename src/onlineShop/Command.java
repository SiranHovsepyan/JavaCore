package onlineShop;

public interface Command {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";

    static void printLoginCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("Please input " + REGISTER + " for REGISTER");

    }
}
