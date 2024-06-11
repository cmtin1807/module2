package ss4.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn là: " + stopwatch.getElapsedTime() + " ms");
    }
}
