package questions$26;

import java.util.LinkedList;

/**
 * N_LargestCollatz.
 * Even: n -> n/2.
 * Odd: n -> 3n + 1.
 * Find the longest Collatz sequence starting with a number under 1_000_000.
 * 
 * @author Doosha
 * @version 04/08/2017
 */
public class N_LargestCollatz {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        LinkedList<Long> list = new LinkedList<Long>();
        
        int answer = 0;
        long largest = 1;
        int bound = 1_000_000;
        
        for (int i = 10; i < bound; i++) {
            long j = i;
            
            //While i is not 1, go through equations
            //until it reaches 1.
            while (j != 1) {
                if (j % 2 == 0) {
                    j /= 2;
                    list.add(j);
                } else {
                    j = (3 * j) + 1;
                    list.add(j);
                }
            }
                       
            if (list.size() > largest) {
                largest = list.size();
                answer = i;
            }
            list.clear();
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println(answer);
        System.out.println(end - begin + " ms");
    }
}
