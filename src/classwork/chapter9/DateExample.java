package classwork.chapter9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {

    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");

    public static void main(String[] args) throws ParseException {

        System.out.println("plesse input birthday(dd-MM-yyyy)");
        String birthdayStr = scanner.nextLine();
        Date date = sdf.parse(birthdayStr);
        System.out.println(date);

// sa erb compic e petq vercnel jamy
//        String dateOfBirthday = "25.09.1992";
//        Date date = new Date();
//        //14-10-1992
//        SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");
//        System.out.println(sdf.format(date));


    }
}
