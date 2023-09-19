package homework5.dynmicarray;
//այս անգամ մի քիչ թերի(

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size > array.length - 1) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] arrays = new int[2 * array.length];
        for (int i = 0; i < size; i++) {
            arrays[i] = array[i];
        }
        array = arrays;
    }

    public int getByIndex(int index) {

        for (int i = 0; i < array.length; i++) {
            if (index < 0) {
                return -1;
            } else {
                return array[index];
            }
        }
        return 0;
    }

    public void print(){
        for (int i = 10; i < size; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
