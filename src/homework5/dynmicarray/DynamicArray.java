package homework5.dynmicarray;

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
            if (index < 0 || index > size) {
                return -1;
            } else {
                return array[index];
            }
        }
        return 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("There is no element for delete");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void set(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("There is no element for delete");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = value;
                break;
            }
        }
    }

    public void add(int index, int value) {
        int tmpVal = 0;
        if (index < 0 || index > size) {
            System.out.println("There is no element for delete");
        } else {
            size++;
            for (int i = size; i > index; i--) {
                tmpVal = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tmpVal;
            }
            array[index] = value;
        }
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                array[i] = value;
                return i;
            }
        }
        return -1;
    }
}
