package questions$26;

/**
 * C_LargestPrime. 
 * The largest prime factor of the number 600851475143.
 * 
 * @author Doosha
 * @version 30/05/2017
 */
public class C_LargestPrime {
    /**
     * Drives the program.
     * 
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        long number = 600851475143L;
        long factor = 2L;
        while (number > 1) {
            // Continues to next factor if current is valid.
            while (number % factor == 0) {
                number /= factor;
            }

            factor++;

            // Prints number if it's prime.
            if (factor * factor > number && number > 1) {
                System.out.println(number);
                break;
            }
        }
            
        long end = System.currentTimeMillis();
        
        System.out.println(end - begin + " ms");
    }
}
