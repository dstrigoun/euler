package questions$26;

/**
 * J_SummationOfPrimes.
 * Find the sum of all the primes below two million.
 * 
 * @author Doosha
 * @version 12/06/2017
 */
public class J_SummationOfPrimes {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        long bound = 2_000_000;
        long sum = 2;
        
        for(int i = 3; i <= bound; i++) {
            if (isPrime(i))
                sum += i;
        }
        long end = System.currentTimeMillis();
        
        System.out.println(sum);
        System.out.println(end - begin + " ms");
    }
    
    /**
     * Determines whether a number is a prime.
     * 
     * @param n
     * @return false if not prime, true if prime
     */
    private static boolean isPrime(int num) {
        if (num < 2) 
            return false;
        if (num == 2) 
            return true;
        if (num % 2 == 0) 
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) 
                return false;
        
        return true;
    }
}
