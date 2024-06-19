package ss10.thuc_hanh.class_list_simple;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private int DEFAULT_COMPACITY = 10;
    private Object[] elements;
    public MyList() {
        elements = (E[]) new Object[DEFAULT_COMPACITY];
    }
    public void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }
    public void add(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }
}
