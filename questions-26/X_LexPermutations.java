package questions$26;
//not done
/**
 * X_LexPermutations
 * Find the thousandth ordered permutation of the 
 * numbers [0, 1, 2, 3, 4, 5, 6, 7, 8, 9].
 * 
 * @author Doosha
 * @version 18/08/2017
 */
public class X_LexPermutations {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int count = 0;
        //TODO
        //put the numbers in an array?
        //go through in order and start with smallest number
        //at the thousandth one print it??
        //idk 
        int number = 1234567890;
        
        for (int first = 0; first < 10; first++) {
            //this one is haarrdddddd
            System.out.println(number);
        }
        
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(end - begin + " ms");
    }
}
