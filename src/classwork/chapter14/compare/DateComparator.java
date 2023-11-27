package classwork.chapter14.compare;

import java.util.Comparator;

public class DateComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        return o1.getRegisterDate().compareTo(o2.getRegisterDate());
        if (o1.getAge()> o2.getAge()){
            return 1;
        } else if (o1.getAge()<o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
