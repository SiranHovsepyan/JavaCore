package classwork.chapter3;

public class TwoArray {
    public static void main(String[] args) {
        int twoArr[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoArr[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
