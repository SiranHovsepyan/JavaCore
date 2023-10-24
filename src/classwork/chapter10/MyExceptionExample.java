package classwork.chapter10;

public class MyExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int c = a * 6;
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
            System.out.println("end of try block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch block works");
        }
    }
}
