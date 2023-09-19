package homework.siran;

public class ArraySortTest {
    public static void main(String[] args) {
        ArraySort myArray = new ArraySort();
        int[] numbers = {6, 4, 8, 2, 9, 10, 3, 7};
        myArray.sort(numbers);
        for (int number:numbers) {
            System.out.print(number+" ");
        }
    }
}
