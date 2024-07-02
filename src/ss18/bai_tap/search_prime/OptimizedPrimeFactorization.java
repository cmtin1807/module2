package ss18.bai_tap.search_prime;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 0;
        for (int n = 2; n < 10000; n++) {
            if (n == 2){
                System.out.println("1. Chạy tối ưu: 2");
                count ++;
            }
            else{
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(count+". Chạy tối ưu: "+n);

            }

        }}

    }

}
