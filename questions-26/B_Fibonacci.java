package questions$26;

/**
 * B_Fibonacci. 
 * Sum of all even Fibonacci numbers whose value does not go higher
 * than 4 million.
 * 
 * @author Doosha
 * @version 27/04/2017
 */
public class B_Fibonacci {
    /**
     * Drives the program.
     * 
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int prevFirst = 0;
        int prevSecond = 1;
        int max = 4_000_000;
        int evenSum = 0;

        boolean exceed = false; // When fib numbers > max

        // Looks for Fib numbers under max.
        while (!exceed) {
            int newFib = prevFirst + prevSecond; // Simple switch between
                                                 // variables
            prevFirst = prevSecond; // First: newFib = 1; First = 1; Second = 1;
            prevSecond = newFib;

            // Stops while statement when exceeds max.
            if (newFib > max) {
                exceed = true;
                break;
            }

            // Adds the even fib number to sum.
            if (newFib % 2 == 0) {
                evenSum += newFib;
            }
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println(evenSum);
        System.out.println(end - begin + " ms");
    }
}
