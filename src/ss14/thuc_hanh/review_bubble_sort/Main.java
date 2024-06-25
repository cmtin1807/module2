package ss14.thuc_hanh.review_bubble_sort;


import java.util.Scanner;

import static ss14.thuc_hanh.review_bubble_sort.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhaap vao phan tu thu "+ i);
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s","mang ban dau: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        bubbleSort(array);
    }
}
