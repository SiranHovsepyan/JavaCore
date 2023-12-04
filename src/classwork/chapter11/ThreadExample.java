package classwork.chapter11;

import java.util.Random;

public class ThreadExample {
    static Random r = new Random();

    public static void main(String[] args) throws InterruptedException {
        MyFirstThread myFirstThread = new MyFirstThread();
//        Thread myThread = new Thread(myFirstThread);
//        myThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main" + i);
            Thread.sleep(1000);
        }


//        for (int i = 0; i < 10000; i++) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    int i1 = (r.nextInt() + r.nextInt() * 2) / 5;
                    System.out.println("new thread" + i + i1);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }

            }
        }).start();
//        }


        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("main" + i);
//            Thread.sleep(500);
        }

    }
}
