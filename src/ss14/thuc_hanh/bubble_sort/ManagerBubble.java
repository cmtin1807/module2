package ss14.thuc_hanh.bubble_sort;

import java.util.Arrays;

public class ManagerBubble {
    public static void bubbleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 0; i < arr.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.println(Arrays.toString(arr));
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
