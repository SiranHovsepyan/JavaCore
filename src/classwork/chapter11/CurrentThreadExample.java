package classwork.chapter11;

public class CurrentThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName(" my ther");
        System.out.println(thread);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
//            Thread.sleep(1000);

        }
        System.out.println(System.currentTimeMillis());
    }
}
