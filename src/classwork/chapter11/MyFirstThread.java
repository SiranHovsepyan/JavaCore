package classwork.chapter11;

public class MyFirstThread implements Runnable {
    Thread t;

    MyFirstThread() {
        t = new Thread(this, "DemoThreda");
        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(" docherni thread" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

