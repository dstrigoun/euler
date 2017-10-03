package questions$26;

/**
 * L_HighDivisibleTriangleNum.
 * Find the first triangle number with over 500 factors.
 * 
 * @author Doosha
 * @version 30/07/2017
 */
public class L_HighDivisibleTriangleNum {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int i = 1;
        int x = 2;
        boolean found = false;
        
        while (!found) {
            if (divisors(i) > 500) {
                long end = System.currentTimeMillis();
                
                System.out.println(i);
                System.out.println(end - begin + " ms");
                found = true;
            }
            else {
                i +=x;
                x++;
            }
        }
    }

    /**
     * Determines how many divisors the triangle number has.
     * 
     * @param n
     * @return number of divisors
     */
    public static int divisors (int n) {
        int counter = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) 
                counter += 2;
        }
        
        return counter;
    }
}
