package ss13.bai_tap.cai_dat_thuat_toan;


import java.util.*;

import static java.util.Arrays.sort;
import static ss13.bai_tap.cai_dat_thuat_toan.SearchBinary.searchBinary;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Menu");
            System.out.println("1. Add Number");
            System.out.println("2. Search Binary");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number");
                    int number = sc.nextInt();
                    list.add(number);
                    break;
                case 2:
                    Collections.sort(list);
                    System.out.println(list);
                    int size = list.size();
                    System.out.println("Enter key: ");
                    int key = sc.nextInt();
                    System.out.println("gia tri can tim o vi tri: "+searchBinary(list,0, size - 1, key));
                    break;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
//        Cach 2:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap chieu dai cua mang ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.println("Nhap vao phan tu thu"+ i);
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(searchBinary(arr,0, size,3));