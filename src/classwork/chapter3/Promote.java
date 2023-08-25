package classwork.chapter3;

public class Promote {
    public static void main(String[] args) {
        byte Ь = 42;
//        a unicode 97
        char с = 'а';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * Ь) + (i / с) - (d * s);
        System.out.println("\nresult = "+(f * Ь) + " + " + (i / с) + " - " + (d * s) +" = "+ result);
    }
}
