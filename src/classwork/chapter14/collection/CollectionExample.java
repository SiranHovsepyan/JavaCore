package classwork.chapter14.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("petros");
        names.add("petros");
        names.add("petros");
        names.add("petros");
        names.add("martiros");
        names.add("martiros");
        names.add("martiros");
        names.add("poxos");

        System.out.println(uniqueNameCount(names));


    }


    public  static  int uniqueNameCount(List<String>names){
//        List<String> uniqueNames =new ArrayList<>();
//        for (String name : names) {
//            if(!uniqueNames.contains(name)){
//                uniqueNames.add(name);
//            }
//        }
//         return  uniqueNames.size();


        return new HashSet<>(names).size();
    }
}
