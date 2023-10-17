package classwork.chapter9.hello;

public class InterfaceTest {
    public static void main(String[] args) {
        EngPereson ep = new EngPereson();
        printHello(ep);
    }

    static void printHello(SayHello sayHello) {
        System.out.println(sayHello.sayHello());
    }
}
