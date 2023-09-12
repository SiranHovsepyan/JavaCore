package homework4;

public class Sort {
    public static void main(String[] args) {
//        Sort numbers smallest to largest
        int[] sortArray = {4, 7, 1, 3, 9, 0, 2};
        int i;
        int nullVar = 0;
        for (int j = 0; j < sortArray.length; j++) {
            for (i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] > (sortArray[i + 1])) {
                    nullVar = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = nullVar;
                }
            }
        }
        for (i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i]);
        }
    }
}
