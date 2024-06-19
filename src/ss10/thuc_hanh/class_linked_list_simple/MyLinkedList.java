package ss10.thuc_hanh.class_linked_list_simple;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    public void add(int index, Object data) {
        Node newNode = new Node(data);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index-1 && current.next!=null; i++) {
            current = current.next;
        }
        Node holder = current.next;
        current.next = newNode;
        newNode.next = holder;
        size++;
    }
    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data+" ");
            current = current.next;
        }
    }
}
