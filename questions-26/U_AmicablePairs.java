package questions$26;

/**
 * U_AmicablePairs.
 * Find the sum of all the amicable pairs under 10000.
 * 
 * @author Doosha
 * @version 10/08/2017
 */
public class U_AmicablePairs {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int sum = 0;
        
        //Finds amicable numbers and adds to sum
        for (int num = 1; num < 10000; num++) {
            int sumA = divisors(num);
            int sumB = divisors(sumA);
            if (num == sumB && num != sumA) {
                sum += num;
            } 
        }
              
        long end = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(end - begin + " ms");
    }
    
    /**
     * Returns all the divisors in a sum.
     * 
     * @param number
     *          Number to determine
     * @return sum of divisors as an int
     */
    public static int divisors(int number) {
        int sumNum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumNum += i;
            }
        }
        return sumNum;
    }
}
