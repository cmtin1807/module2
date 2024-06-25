package ss14.thuc_hanh.Test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        int[] arr = {10, 8, 9, 12, 6, 4};
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j;
            for(j = i - 1; j >=0 && arr[j] > current; j--){
                    arr[j+1] = arr[j];
            }
            arr[j+1] = current;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));








//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
//            int index = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                System.out.println(Arrays.toString(arr));
//                if (min > arr[j]) {
//                    min = arr[j];
//                    index = j;
//                }
//            }
//            if (index != i) {
//                arr[index] = arr[i];
//                arr[i] = min;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//














//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j =  i + 1; j < arr.length; j++) {
//                System.out.println(Arrays.toString(arr));
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
    }
}