package questions$26;

/**
 * E_SmallestMultiple.
 * Find the smallest positive number that is evenly divisible by all of the numbers from 1 to 20.
 * 
 * @author Doosha
 * @version 04/06/2017
 */
public class E_SmallestMultiple {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        long i = 2520;
        boolean found = false;
        
        while (!found) {
            i += 2520;
            boolean divis = true;
            
            //Since 2520 is the smallest multiple between 1 - 10, we start from 
            //11 to continue.
            for (int j = 11; j <= 20; j++) {
                //Determines whether number is divisible.
                if (i % j != 0) {
                    divis = false;
                    break;
                }
                else {
                }
            }
            
            if (divis) {
                found = true;
            }
        }
        long end = System.currentTimeMillis();
        
        System.out.println(i);
        System.out.println(end - begin + " ms");
        
    }
}
