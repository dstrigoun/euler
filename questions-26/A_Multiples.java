package questions$26;

/**
 * A_Multiples.
 * Multiples of 3 or 5 below 1000.
 * 
 * @author Doosha
 * @version 18/03/2017
 */
public class A_Multiples {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int[] multiple = new int[1000];
        int sum = 0;
        
        //Looks for multiples of 3 or 5 when scanning through the multiple array.
        for (int i = 0; i < multiple.length; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        long end = System.currentTimeMillis();
        
        System.out.println(sum);
        System.out.println(end - begin + " ms");
    }
}
