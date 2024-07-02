package ss18.bai_tap.search_prime;

public class Main {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread thread2 = new Thread(optimizedPrimeFactorization);
        thread2.start();
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        Thread thread = new Thread(lazyPrimeFactorization);
        thread.start();



    }
}
