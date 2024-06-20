package ss11.thuc_hanh.trien_khai_queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;

    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }
    public Node dequeue() {
        if (this.head == null) {
            this.tail = null;
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        return temp;
    }
}

