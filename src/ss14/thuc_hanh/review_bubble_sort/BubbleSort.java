package ss14.thuc_hanh.review_bubble_sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean needNextPast = true;
        for (int i = 0; i < arr.length - 1&& needNextPast; i++) {
            needNextPast = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPast = true;
                }
            }
        }
        System.out.printf("%-20s","Mang sau khi sap xep: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
