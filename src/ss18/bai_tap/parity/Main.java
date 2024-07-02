package ss18.bai_tap.parity;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        oddThread.start();
        oddThread.join();
        EvenThread evenThread = new EvenThread();
        evenThread.start();
        evenThread.join();

        System.out.println("Cong Oke");
    }
}
