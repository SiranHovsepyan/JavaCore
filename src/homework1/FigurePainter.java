package homework1;

public class FigurePainter {
    public static void main(String[] args) {
//        First example of homework1
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

//      Second example of homework1
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
        System.out.println();

//        Third example of homework1
        for (int i = 0; i < 5; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" l ");
            }
            for (int t = 0; t <= i; t++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

//        Forth example of homework1
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int n = 5; n > i; n--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

//        Fifth example of homework1
        for (int i = 5; i > 0; i--) {
            for (int b = 0; b <= i; b++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = -2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
