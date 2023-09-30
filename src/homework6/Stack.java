package homework6;

public class Stack {
    private int stck[];
    public int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int ch) {
        if (tos == stck.length - 1)
            extend();
        else
            stck[++tos] = ch;
    }

    private void extend() {
        int[] stcks = new int[stck.length + 20];
        for (int i = 0; i < tos; i++) {
            stcks[i] = stck[i];
        }
        stck = stcks;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack isn`t full");
            return 0;
        } else
            return stck[tos--];
    }

    public int lastIndex() {
        return stck[tos];
    }
}
