package ss14.bai_tap.insertion_sort;




public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j;
            for (j = i - 1; j >= 0 && current < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = current;
        }
        System.out.printf("%-25s", "Insertion Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    }

