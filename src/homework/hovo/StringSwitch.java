package homework.hovo;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("its one");
                break;
            case "two":
                System.out.println("its two");
                break;
            case "three":
                System.out.println("its three");
                break;
            default:
                System.out.println("dont supportesd");
                break;
        }
    }
}
