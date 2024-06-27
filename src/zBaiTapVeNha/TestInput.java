package zBaiTapVeNha;

import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int c = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten");

        String name = sc.nextLine();
        System.out.println(c);
        System.out.println(name);
    }
}
