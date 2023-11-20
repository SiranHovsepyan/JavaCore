package classwork.chapter14.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        Set<Integer> mySet = new HashSet<>();
//        mySet.add(5);
//        mySet.add(5);
//        mySet.add(5);
//        mySet.add(5);
//        mySet.add(7);
//        mySet.add(2);
//        for (Integer i : mySet) {
//            System.out.println(i);
//        }

//        Set<Integer> mySet = new TreeSet<>();
//        mySet.add(5);
//        mySet.add(5);
//        mySet.add(5);
//        mySet.add(5);
//        mySet.add(7);
//        mySet.add(2);
//        for (Integer i : mySet) {
//            System.out.println(i);
//        }

        Set<Integer> mySet = new LinkedHashSet<>();
        mySet.add(5);
        mySet.add(5);
        mySet.add(5);
        mySet.add(5);
        mySet.add(7);
        mySet.add(2);
        for (Integer i : mySet) {
            System.out.println(i);
        }


    }
}
