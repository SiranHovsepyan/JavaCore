package homework.siran;

public class FigurePainter {
    void figureOne(int a, char c) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }
    }


}
