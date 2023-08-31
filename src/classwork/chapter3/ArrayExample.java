package classwork.chapter3;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int lastIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " - ");
        }
    }
}
