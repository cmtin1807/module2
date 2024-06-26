package ss15.thuc_hanh.use_class_arrayindexoutofboundsexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 //       ArrayExample arrExample = new ArrayExample();
        Integer[] arr = ArrayExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
