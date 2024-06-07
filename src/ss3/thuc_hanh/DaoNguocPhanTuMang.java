package ss3.thuc_hanh;

import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap chieu dai mang nho hon hoac bang 20: ");
            size = sc.nextInt();
        }
        while (size > 20 || size <= 0);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập giá trị phần tủ " + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-25s", "Các giá trị của mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println();
        System.out.printf("%-25s", "Mảng Đảo Ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


    }
}
