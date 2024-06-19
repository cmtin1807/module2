package ss10.thuc_hanh.class_list_simple;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Element 1: " + list.get(0));
        System.out.println("Element 2: " + list.get(1));
        System.out.println("Element 3: " + list.get(2));
        System.out.println("Element 4: " + list.get(3));
        System.out.println("Element 5: " + list.get(4));
        System.out.println("Element 6: " + list.get(5));
    }

}
