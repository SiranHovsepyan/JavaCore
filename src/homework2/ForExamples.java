package homework2;

public class ForExamples {
    public static void main(String[] args) {

//        Type 1-1000 numbers with symbol "-" without last index
        int[] numbers = new int[1000];
        int lastIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers.length) {
                System.out.print(numbers[i] + "   ");
            } else {
                System.out.print(numbers[i] + " - ");
            }
        }

        System.out.println();
        System.out.println();

//        Find even numbers(чётные числа) in 1-100 numbers used %
        int[] numsHund = new int[100];
        for (int j = 0; j < numsHund.length; j++) {
            numsHund[j] = j + 1;
        }
        for (int j = 0; j < numsHund.length; j++) {
            if (numsHund[j] % 2 == 0) {
                System.out.print(numsHund[j] + " ");
            }
        }

        System.out.println();
        System.out.println();

//        Find greater number
        int[] greatNum = {2, 5, 8, 4, 9, 3, 7};
        int f = 0;
        for (int k = 0; k < greatNum.length; k++) {
            if (greatNum[f] >= greatNum[k]) {
                greatNum[k] = k + 1;
            } else {
                greatNum[f] = greatNum[k];
            }
        }
        System.out.print(greatNum[f]);
    }
}
