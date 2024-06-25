package ss14.bai_tap.insertion_sort;

import java.util.Scanner;

import static ss14.bai_tap.insertion_sort.InsertionSort.insertionSort;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element: " + i);
            arr[i] = sc.nextInt();
        }
        System.out.printf("%-25s", "The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        insertionSort(arr);
    }
}
