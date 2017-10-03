package questions$26;

/**
 * G_BigPrime. 
 * Find the 10_001st prime number. 
 * 
 * @author Doosha
 * @version 04/06/2017
 */
public class G_BigPrime {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int NumPrimes = 1; 
        long i = 2;
        
        while (NumPrimes <= 10001) {
            //Determines if i is prime and when to stop.
            if (isPrime(i)) {
                if (NumPrimes == 10001) {
                    long end = System.currentTimeMillis();
                    System.out.println(i);
                    System.out.println(end - begin + " ms");
                    break;
                }
                i++;
                NumPrimes++;
            }
            else
                i++;
        }
    }
    
    /**
     * Determines whether a number is a prime.
     * 
     * @param n
     * @return false if not prime, true if prime
     */
    public static boolean isPrime(long n) {
        if ((n % 2 == 0)&&(n != 2)) {
            return false;
        }
        
        for (long i = 3; i <= (n^(1/2) + 1); i += 2) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }
}
