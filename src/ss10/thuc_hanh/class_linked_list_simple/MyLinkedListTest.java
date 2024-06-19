package ss10.thuc_hanh.class_linked_list_simple;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(5);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(9);
        myLinkedList.add(4,99);

        myLinkedList.printList();

    }

}
