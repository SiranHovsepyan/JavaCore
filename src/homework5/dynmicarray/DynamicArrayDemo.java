package homework5.dynmicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray();
        myDynamicArray.add(1);
        myDynamicArray.add(22);
        myDynamicArray.add(13);
        myDynamicArray.add(4);
        myDynamicArray.add(67);
        myDynamicArray.add(98);
        myDynamicArray.add(88);
        myDynamicArray.add(76);
        myDynamicArray.add(23);
        myDynamicArray.add(34);
        myDynamicArray.add(66);
        myDynamicArray.add(78);
        myDynamicArray.add(7);
        myDynamicArray.add(8);
        myDynamicArray.add(9);
        myDynamicArray.add(56);
        myDynamicArray.add(77);
        System.out.println("\n" + myDynamicArray.getByIndex(10));
        myDynamicArray.print();

    }
}
