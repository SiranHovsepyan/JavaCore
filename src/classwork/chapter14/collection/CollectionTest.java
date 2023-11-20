package classwork.chapter14.collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("poxos");
//        names.add("petros");
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println("------------------");
//
//        names.remove(0);
//        for (String name : names) {
//            System.out.println(name);
//        }

//
//        List<Integer> numbers =new LinkedList<>();
//        numbers.add(1);
//        numbers.add(14);
//        numbers.add(164);
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
//        System.out.println("---------");
//        numbers.remove(Integer.valueOf(14));
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }

//        List<User> users= new ArrayList<>();
//        User user =new User("1","sdd","dd","sdd", UserAdminType.USER);
//        users.add(user);
//        for (User user1 : users) {
//            System.out.println(user1);
//        }


        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("Poxos");
        myQueue.add("Aram");
        myQueue.add("Zaven");

//        for (String s : myQueue) {
//            System.out.println(s);
//        }

//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());


    }
}
