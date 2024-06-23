package ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.service;

import ss12.bai_tap.use_arraylist_and_linkedlist.array_list.linkedlist.molde.Product;

import java.util.*;

public class ProductManager {
    LinkedList<Product> productList;
    private Node head;
    private int numberNodes;

    public ProductManager() {
        head = new Node(new Product());
        numberNodes = 1;
    }

    private class Node {
        Product product;
        Node next;

        public Node(Product product) {
            this.product = product;
        }

        Product getProduct() {
            return this.product;
        }
    }

    public void add(int index, Product product) {
        Node newNode = new Node(product);
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

    public void addFirst(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        numberNodes++;
    }

    public void addLast(Product product) {
        Node newNode = new Node(product);
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

    public void remove(Product product) {
        Node previous = head;
        while (previous != null) {
            if (previous.next != null && previous.next.product.equals(product)) {
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
        return current.product;
    }

    public int size() {
        return numberNodes;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.product + " ");
            current = current.next;
        }

    }

    public ProductManager clone() {
        ProductManager newList = new ProductManager();
        Node current = head.next;
        Node newCurrent = newList.head;

        while (current != null) {
            Node newNode = new Node(current.product);
            newCurrent.next = newNode;

            newCurrent = newCurrent.next;
            current = current.next;
        }

        newList.numberNodes = numberNodes;
        return newList;
    }

    public boolean contains(Product product) {
        Node current = head;
        while (current != null) {
            if (current.product.equals(product)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(Object o) {
        Node current = head;
        for (int i = 0; i < numberNodes; i++) {
            if (current.product.equals(o)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
}
