package ss10.bai_tap.phuong_thuc_cua_linked_list;

public class MyLinkedList {
    private Node head;
    private int numberNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numberNodes = 1;
    }

    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node newNode = new Node(data);
        if (index < 0 || index > numberNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        Node holder = current.next;
        current.next = newNode;
        newNode.next = holder;
        numberNodes++;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        numberNodes++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numberNodes++;
    }

    public void remove(int index) {
        if (index < 0 || index >= numberNodes) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
        }
        numberNodes--;
    }

    public void remove(Object data) {
        Node previous = head;
        while (previous != null) {
            if (previous.next != null && previous.next.data.equals(data)) {
                previous.next = previous.next.next;
                numberNodes--;
                return;
            }
            previous = previous.next;
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= numberNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return numberNodes;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList(head.data);
        Node current = head.next;
        Node newCurrent = newList.head;

        while (current != null) {
            Node newNode = new Node(current.data);
            newCurrent.next = newNode;

            newCurrent = newCurrent.next;
            current = current.next;
        }

        newList.numberNodes = numberNodes;
        return newList;
    }

    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(Object o) {
        Node current = head;
        for (int i = 0; i < numberNodes; i++) {
            if (current.data.equals(o)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
}
