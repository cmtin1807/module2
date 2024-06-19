package ss10.bai_tap.phuong_thuc_cua_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(0, 1);
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 4);
        list.add(3, 5);

        System.out.print("Danh sách list: ");
        list.printList(); // In: 2 3 4 5 1

        list.remove(2);
        System.out.print("Danh sách list sau khi xóa: ");
        list.printList(); // In: 2 3 5 1

        System.out.println("Chỉ số của phần tử 1 trong list: " + list.indexOf(1)); // In: 4
        System.out.println("Kích thước của list: " + list.size()); // In: 4

        MyList<Integer> list2 = list.clone();
        list2.add(2,3);
        list2.add(1,4);

        System.out.print("Danh sách list sau khi thêm: ");
        list.printList();
        System.out.print("Danh sách list2 sau khi thêm: ");
        list2.printList();
    }
}
