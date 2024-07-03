package module2.phuongtiengiaothong.controller;

import module2.phuongtiengiaothong.service.QuanLyPhuongTien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyPhuongTien quanLy = new QuanLyPhuongTien();

        int choice;
        do {
            System.out.println("\nCHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    quanLy.themPhuongTien();
                    break;
                case 2:
                    quanLy.hienThiPhuongTien();
                    break;
                case 3:
                    quanLy.xoaPhuongTien();
                    break;
                case 4:
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }
}

