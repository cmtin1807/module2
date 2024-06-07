package ss2.thuc_hanh;

import java.util.Scanner;

public class MenuUngDUng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hinh tam giac ");
        System.out.println("2. Hinh vuong");
        System.out.println("3. Hinh chu nhat");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                break;
            case 2:
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            case 3:
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Chua dua ra lua chon");

        }
    }
}
