package classwork.chapter5;

public class ArrayUtilHomework {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
        System.out.println(numbers.length);
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[0] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min:" + min);
        if (numbers.length % 2 == 0) {
            System.out.println("middle number" +
                    numbers[numbers.length / 2 - 1] + " " +
                    numbers[numbers.length / 2]);

        } else {
            System.out.println("middle number" +
                    numbers[numbers.length / 2]);
        }


    }
}
