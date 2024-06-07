package ss2.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hinh chu nhat");
        System.out.println("2. 4 Hinh tam giac vuong");
        System.out.println("3. Hinh tam giac can");
        System.out.println("0. Exit");
        System.out.println("Enter lua chon cua ban");
        int choi = sc.nextInt();
        switch (choi) {
            case 1:
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();

                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5-i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= 5-i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5-i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Lựa chọn của bạn không phù hợp");
        }
    }
}
