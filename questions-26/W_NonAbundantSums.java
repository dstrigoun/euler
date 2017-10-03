package questions$26;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * W_NonAbundantSums.
 * A perfect number is a number for which the sum of its 
 * proper divisors is exactly equal to the number.
 * A number is called abundant if this sum exceeds n.
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
 * the smallest number that can be written as the sum of two abundant numbers is 24.
 * 
 * Find the sum of all the positive integers which CANNOT 
 * be written as the sum of two abundant numbers.
 * 
 * @author Doosha
 * @version 16/08/2017
 */
public class W_NonAbundantSums {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        ArrayList<Integer> abundantNum = new ArrayList<Integer>();
        int total = 0;
        
        //Finds abundant numbers under the limit
        for (int i = 0; i < 28123; i++) {
            if (isAbundant(i)) {
                abundantNum.add(i);
            }
        }
        
        int[] arr = new int[abundantNum.size()];
        
        //Makes an array from the ArrayList
        for (int i = 0; i < abundantNum.size(); i++) {
            if (abundantNum.get(i) != null) {
                arr[i] = abundantNum.get(i);
            }
        }
        
        //Checks to see if number is not a sum of two abundant numbers
        for (int i = 0; i < 28123; i++) {
            if (!isSum(arr, arr.length, i)) {
                total += i;
            }
        }
        
        long end = System.currentTimeMillis();
        System.out.println(total);
        System.out.println(end - begin + " ms");
    }

    /**
     * Determines whether a number is abundant.
     * 
     * @param i
     *          number to be determined
     * @return boolean
     */
    private static boolean isAbundant(int number) {
        int sumNum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumNum += i;
            }
        }
        
        if (sumNum > number) {
            return true;
        }
        
        return false;
    }
    
    /**
     * Determines if a number is a sum of two
     * numbers in an array. 
     * 
     * @param array
     *          array of abundant numbers
     * @param arr_size
     *          size of array
     * @param sum
     *          sum that two numbers must add up to 
     * @return boolean
     */
    private static boolean isSum(int[] array, int arr_size, int sum) {
        int start = 0;
        int end = arr_size - 1;
        
        Arrays.sort(array);
        
        while (start <= end) {
            if (array[start] + array[end] == sum) {
                return true;
            } else if (array[start] + array[end] < sum) {
                start++;
            } else {
                end--;
            }
        }
        
        return false;
    }
}
