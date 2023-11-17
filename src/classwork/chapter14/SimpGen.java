package classwork.chapter14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<Integer,String>(11,"annaan");
        tgObj.showTypes();


        int v = tgObj.getOb1();
        System.out.println("Value is: "+ v);

        String str = tgObj.getOb2();
        System.out.println("Value is: "+str);

    }
}
