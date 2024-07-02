package ss18.bai_tap.parity;

public class OddThread extends Thread{
    @Override
    public synchronized void run() {
        for(int i=1;i<=10;i++){
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
