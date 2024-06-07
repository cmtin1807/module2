package ss3.thuc_hanh;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[]arr = {12,24,54,87,99,102,84,72,5,7};
        int index = giaTriNhoNhat(arr);
        System.out.println("Giá trị nhỏ nhất là: " + arr[index]+ " nằm ở vị trí " +index);
    }
    public static int giaTriNhoNhat(int[] arr) {
        int index = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
