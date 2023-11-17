package classwork.chapter14.metaSymbol;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Middle value iob is " + v);


        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Middle value dob is " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("Middle value fob is " + x);


        System.out.println("Middle value of i0b and dob");
        if (iob.sameAvg(dob)){
            System.out.println("equals!!!");
        }else {
            System.out.println("different!!!");
        }


        System.out.println("Middle value of i0b and fob");
        if (iob.sameAvg(fob)){
            System.out.println("equals!!!");
        }else {
            System.out.println("different!!!");
        }


    }
}
