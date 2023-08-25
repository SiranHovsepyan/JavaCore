package homework.siran;

public class Homework1 {
    public static void main(String[] args) {
//        int i;
//        char k = '*';
//        for (i = 0; i < 6; i++) {
//            System.out.print(k);
//            System.out.print(k);
//            System.out.print(k);
//            System.out.print(k);
//            System.out.print(k);
//            System.out.println(k);
//        }

//        for (int j = 0; j < 6; j++) {
//            for (int i = 0; i< 6; i++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
        for (int i = 6; i > 0; i--) {
            for (int b = 0; b < i; b++) {
                System.out.print("  ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print(" *  ");
            }

            System.out.println(" *");
        }


    }
}
