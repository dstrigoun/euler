package questions$26;

import java.math.BigInteger;

/**
 * Y_ThousandDigitFib
 * What is the index of the first term in the 
 * Fibonacci sequence to contain 1000 digits?
 * 
 * @author Doosha
 * @version 18/08/2017
 */
public class Y_ThousandDigitFib {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int n = 0;
        int count = 2;
        
        BigInteger limit = (new BigInteger("10")).pow(999); //1000 digits
        BigInteger[] fib = new BigInteger[3];

        fib[0] = BigInteger.ONE;
        fib[2] = BigInteger.ONE;

        while ((fib[n]).compareTo(limit) < 0) {
            n = (n + 1) % 3;
            count++;
            fib[n] = fib[(n + 1) % 3].add(fib[(n + 2) % 3]);
        }

        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(end - begin + " ms");
    }
}
