package ss18.bai_tap.search_prime;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int count = 0;
        for(int n=2;n<=10000;n++) {
            if (n==2){
                System.out.println("1. Chạy không tối ưu: 2");
                count++;
            }
            else{
                boolean isPrime = true;
                for(int k=2;k<n;k++){
                    if(n%k==0){
                        isPrime = false;
                    }
                }
                if(isPrime){
                    count++;
                    System.out.println(count+". Chạy không tối ưu: "+n);
                }
            }
        }
    }
}
