package ss1.thuc_hanh;

import java.util.Scanner;

public class DienTichChuNhat {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        width = scanner.nextFloat();
        System.out.println("Nhap chieu rong: ");
        height = scanner.nextFloat();
        System.out.println("Dien tich hinh chu nhat la: " + width * height);
        scanner.close();
    }
}
