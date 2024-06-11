package ss4.bai_tap;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    // Khởi tạo đối tượng StopWatch và đặt startTime bằng thời điểm hiện tại
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Bắt đầu đo thời gian bằng cách cập nhật giá trị của startTime
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Kết thúc đo thời gian bằng cách cập nhật giá trị của endTime
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Trả về thời gian đã trôi qua giữa startTime và endTime
    public long getElapsedTime() {
        return endTime - startTime;
    }

    // Phương thức sắp xếp mảng sử dụng thuật toán sắp xếp chọn
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Trao đổi giá trị của arr[minIdx] và arr[i]
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Khởi tạo mảng arr với 100,000 số nguyên ngẫu nhiên
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        // Tạo một đối tượng StopWatch để đo thời gian thực thi
        StopWatch stopwatch = new StopWatch();
        // Bắt đầu đo thời gian
        stopwatch.start();

        // Sắp xếp mảng arr
        selectionSort(arr);

        // Kết thúc đo thời gian
        stopwatch.stop();

        // In ra thời gian thực thi của thuật toán sắp xếp chọn
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn là: " + stopwatch.getElapsedTime() + " ms");
    }
}
