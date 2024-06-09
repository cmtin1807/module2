package ss3.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {5, 12, 54, 66, 44, 84, 15};
        int index;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri can them vao: ");
        index = sc.nextInt();
        System.out.print("Nhap gia tri can them vao: ");
        x = sc.nextInt();
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; j < newArray.length; i++, j++) {
            if (j == index) {
                newArray[j] = x;
                j++;
            } else {
                newArray[j] = array[i];
            }
        }
        System.out.printf("%-25s", "Mảng Ban Đầu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.printf("%-25s", "Mảng Sau Khi Thêm: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
