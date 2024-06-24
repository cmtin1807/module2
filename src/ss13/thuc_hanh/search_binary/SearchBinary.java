package ss13.thuc_hanh.search_binary;

public class SearchBinary {
    public static int searchBinary( int[] arr, int a) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a == arr[mid]) {
                return mid;
            }
            if (a < arr[mid]) {
                high = mid - 1;
            }
            if (a > arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;

    }
}
