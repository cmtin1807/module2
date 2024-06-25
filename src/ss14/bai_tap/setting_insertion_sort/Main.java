package ss14.bai_tap.setting_insertion_sort;

import static ss14.bai_tap.setting_insertion_sort.InsertionSort.insertionSort;

public class Main {
    public static void main(String[] args) {
        int [] arr = {9,11,24,35,7,11,5,77};
        System.out.printf("%-25s", "The array before sort: ");
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        System.out.println();
        insertionSort(arr);
    }
}
