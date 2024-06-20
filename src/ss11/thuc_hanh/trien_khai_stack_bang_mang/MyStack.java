package ss11.thuc_hanh.trien_khai_stack_bang_mang;

public class MyStack {
    private int[]stackArr;
    private int size;
    private int index;
    public MyStack(int size) {
        this.size = size;
        stackArr = new int[size];
        index = 0;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArr[index] = value;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = stackArr[index-1];
        index--;
        return value;

    }
    public boolean isEmpty() {
        return index == 0;
    }
    public boolean isFull() {
        return index == size;
    }


    public int size() {
        return index;
    }
}
