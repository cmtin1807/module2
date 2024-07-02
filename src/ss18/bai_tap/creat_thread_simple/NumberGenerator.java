package ss18.bai_tap.creat_thread_simple;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i + " - Hashcode: " + hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
