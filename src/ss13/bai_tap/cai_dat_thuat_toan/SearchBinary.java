package ss13.bai_tap.cai_dat_thuat_toan;

import java.util.List;

public class SearchBinary {
    public static int searchBinary(List<Integer> arr, int low, int high, int key) {
        int mid = (low + high) / 2;
        if (arr.get(mid) == key) {
            return mid;
        } else if (arr.get(mid) > key) {
            return searchBinary(arr, low, mid - 1, key);
        } else if (arr.get(mid) < key) {
          return searchBinary(arr, mid + 1, high, key);
        }
        return -1;
    }
}