package classwork.chapter14.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class CompareExample {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Set<Student> students = new TreeSet<>();
        students.add(new Student("aram", "ddd", 23, simpleDateFormat.parse("02-02-1992")));
        students.add(new Student("poxos", "ddd", 55, simpleDateFormat.parse("02-03-1992")));
        students.add(new Student("zaven", "ddd", 44, simpleDateFormat.parse("02-04-1992")));

        for (Student s : students) {
            System.out.println(s);
        }

//        ete stringy shat erkare
//        String text = """
//                swdref
//                rftg
//                gfth
//                """;
    }
}
