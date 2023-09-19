package classwork.chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox1 = new Box(12,3,3);
        Box myBox2 = new Box(4,4,5);

        double vol;
        vol = myBox1.volume();
        System.out.println("обьем  равен "+vol);
        vol = myBox2.volume();
        System.out.println("обьем  равен "+vol);

    }
}
