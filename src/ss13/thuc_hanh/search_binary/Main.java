package ss13.thuc_hanh.search_binary;

import java.util.Scanner;

import static ss13.thuc_hanh.search_binary.SearchBinary.searchBinary;

public class Main {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 11, 22, 33, 45, 47, 78, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri can tim");
        int value = sc.nextInt();
        System.out.println("vi tri thu "+ searchBinary(number, value));
    }

}