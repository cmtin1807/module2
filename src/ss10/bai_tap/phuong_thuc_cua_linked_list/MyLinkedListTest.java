package ss10.bai_tap.phuong_thuc_cua_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(10);


        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.add(2, 15);


        System.out.print("Danh sách sau khi thêm: ");
        list.printList();
        System.out.println("Số lượng phần tử trong danh sách: " + list.size());


        int index = list.indexOf(20);
        if (index != -1) {
            System.out.println("Phần tử 20 có vị trí index = " + index);
        } else {
            System.out.println("Phần tử 20 không tồn tại trong danh sách");
        }


        boolean contains30 = list.contains(30);
        System.out.println("Danh sách có chứa phần tử 30 không? " + contains30);


        list.remove(1);
        System.out.print("Danh sách sau khi xóa phần tử ở index 1: ");
        list.printList();
    }
}
