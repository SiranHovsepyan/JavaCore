package homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int i;
        int g = 0;
        int s = 0;
        int t = 0;
        int f = numbers[0];
        int result = 0;
        int k = numbers.length;
        int p = numbers.length-1;

        for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.print("\nFirst element of array is  " + numbers[0]);
        System.out.print("\nLast element of array is  " + p);
        System.out.print("\nLength of array are " + numbers.length);
        for (i = 0; i < numbers.length; i++) {
            if (f > numbers[i]) {
                f = numbers[i];
                System.out.print("\nThe smallest number is " + f);
            }
        }

        if (numbers.length <= 2) {
            System.out.println("\nCan't print middle values");
        } else if (numbers.length % 2 == 0) {
            while (++t < --k) ;
            System.out.print("\nMiddle values " + numbers[k - 1] + numbers[t]);
        } else if (numbers.length % 2 != 0) {
            while (++t < --k) ;
            System.out.print("\nMiddle values " + numbers[k]);
        }

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                g++;
            }
        }
        System.out.print("\nEven numbers length are  " + g);

        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                s++;
            }
        }
        System.out.print("\nUnEven numbers length are  " + s);

        for (i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.print("\nSum of elements are " + result);
        System.out.print("\nAverage of numbers equals  " + result / numbers.length);
    }
}
