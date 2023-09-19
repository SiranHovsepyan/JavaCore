package homework.siran;

public class ArraySort {
    public void sort(int []numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length-i; j++) {
                if(numbers[j-1]>numbers[j]){
                    int tmp =numbers[j];
                    numbers[j]=numbers[j-1];
                    numbers[j-1]= tmp;
                }
            }
        }

    }
}
