package ss10.bai_tap.phuong_thuc_cua_array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public MyList() {
        element = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = (E[]) new Object[capacity];
    }

    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size; i > index; i--) {
            element[i] = element[i - 1];
        }
        element[index] = e;
        size++;
    }

    public E remove(int index) {
        E removedElement = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> newList = new MyList<>();
        for (int i = 0; i < size; i++) {
            newList.add((E) element[i]);
        }
        return newList;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity();
        element[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity() {
        if (size == DEFAULT_CAPACITY) {
            element = Arrays.copyOf(element, size * 2);
        }
    }

    public E get(int index) {
        return (E) element[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            element[i] = null;
        }
        size = 0;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(element[i] + " ");
        }
        System.out.println();
    }
}
