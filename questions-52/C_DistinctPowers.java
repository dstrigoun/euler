package questions$52;

import java.util.ArrayList;
//not done
/**
 * C_DistinctPowers.
 * a has a range of 2 <= a <= 100, b has a range of 2 <= b <= 100.
 * Find all the results of a^b, and put it in numerical order. 
 * Remove any repeats. Find out how many distinct terms are in that list.
 * 
 * @author Doosha
 * @version 07/09/2017
 */
public class C_DistinctPowers {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        double num = 0;
        ArrayList<Double> list = new ArrayList<Double>();
        
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                num = Math.pow(a, b);
                list.add(num);
            }
        }
            
        findRepeat(num);
        //find repeat
        //if true, remove all traces of number from array
        //if false, do nothing
        
        long end = System.currentTimeMillis();
        System.out.println(list);
        System.out.println(end - begin + " ms");
    }
    
    public static boolean findRepeat(double num) {
        return false;
    }
}
