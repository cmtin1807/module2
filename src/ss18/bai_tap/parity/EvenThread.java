package ss18.bai_tap.parity;

public class EvenThread extends Thread {
    @Override
    public  void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            try{
                Thread.sleep(15);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
