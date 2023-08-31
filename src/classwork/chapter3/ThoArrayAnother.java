package classwork.chapter3;

public class ThoArrayAnother {
    public static void main(String[] args) {
        int twoA[][] = new int[4][];
        twoA[0] = new int[1];
        twoA[1] = new int[2];
        twoA[2] = new int[3];
        twoA[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoA[i][j] = k;
                k++;
            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoA[i][j] + " ");
            }
            System.out.println();
        }

    }
}
