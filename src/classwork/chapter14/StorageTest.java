package classwork.chapter14;

public class StorageTest {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("poxos");
        stringStorage.add("petros");
//        stringStorage.print();
//        String byIndex = stringStorage.getByIndex(1);
//        System.out.println(byIndex);

        Storage<Integer> intStorage = new  Storage<>();
        intStorage.add(10);
        intStorage.add(20);
        intStorage.print();

    }

}
