package questions$26;

/**
 * I_PythagoreanTriplet.
 * Find the product abc, for which a + b + c = 1000.
 * 
 * @author Doosha
 * @version 12/06/2017
 */
public class I_PythagoreanTriplet {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int a = 0;
        int b = 0;
        int c = 0;
        int s = 1000;
        boolean found = false;
        
        //Finds 3 variables that when squared, equal each other.
        for (a = 1; a < s / 3; a++) {
            for (b = a; b < s / 2; b++) {
                c = s - a - b;
         
                if (a * a + b * b == c * c) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        
        System.out.println("Product of triplet is: " + (a*b*c));
        System.out.println(end - begin + " ms");
    }
}
