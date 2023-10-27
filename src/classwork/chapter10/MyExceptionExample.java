package classwork.chapter10;

public class MyExceptionExample {
    public static void main(String[] args) {
//        String name = "poxos 0";
//        String s = null;
//        try {
//            s = StringUtil.checkString(name);
//            System.out.println(s);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        String numberStr = "122p2";
        try {
            int i = Integer.parseInt(numberStr);
            System.out.println(i * i);
        }catch (NumberFormatException e){
            System.err.println("Error: "+e.getMessage());
        }

//        int a = 10;
//        int c = a * 6;
//        int[] numbers = {1, 2, 3};
//        try {
//            System.out.println(numbers[5]);
//            System.out.println("end of try block");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("catch block works");
//        }
    }


}
