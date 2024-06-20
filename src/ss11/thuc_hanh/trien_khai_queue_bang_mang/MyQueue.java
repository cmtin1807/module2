package ss11.thuc_hanh.trien_khai_queue_bang_mang;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;
    public MyQueue(int currentSize) {
        this.capacity = currentSize;
        this.queueArr = new int[currentSize];

    }
    public boolean isQueueFull() {
        return (currentSize == capacity);
    }
    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }
    public void enqueue(int value) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        }
        else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = value;
            currentSize++;
            System.out.println("Element " + value + " is pushed to Queue !");
        }
    }
    public void dequeue() {
        if(isQueueEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            }
            else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;

        }

    }
}
