package classwork.chapter7;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers divided by ,");
        String numbersStr = scanner.nextLine();
        String[] numbersStrArray = numbersStr.split(",");
        int[] numbers = new int[numbersStrArray.length];
        int index = 0;
        for (String numberStr:numbersStrArray) {
            numbers[index++] = Integer.parseInt(numberStr);
        }

        int max = ArrayUtil.max(numbers);
        System.out.println("max: " + max);


//        System.out.println("please input a");
//        int a= Integer.parseInt(scanner.nextLine());
//        System.out.println("please input b");
//        int b= Integer.parseInt(scanner.nextLine());
//        System.out.println(a+b);
//
//        System.out.println("please input + or -");
//        String c =scanner.nextLine();

//        if (c.equals("+")){
//            System.out.println(a+b);
//        } else if (c.equals("-")) {
//            System.out.println(a-b);
//        }else {
//            System.out.println("unsupported");
//        }

//        System.out.println("Please input full name");
//        String fullname = scanner.nextLine();
//        String[] fullnameArray = fullname.split(" ");
//        System.out.println(fullnameArray[0]);
//        System.out.println(fullnameArray[1]);

    }
}
