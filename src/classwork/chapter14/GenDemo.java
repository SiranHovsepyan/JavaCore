package classwork.chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(22);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Type: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Text  generic");
        strOb.showType();


        String str = strOb.getOb();
        System.out.println("Value " + str);

    }
}
