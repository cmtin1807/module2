package ss18.bai_tap.creat_thread_simple;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();
        Thread t1 = new Thread(generator);
        Thread t2 = new Thread(generator2);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
