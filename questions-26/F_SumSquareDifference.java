package questions$26;

/**
 * F_SumSquareDifference.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * @author Doosha
 * @version 04/06/2017
 */
public class F_SumSquareDifference {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int sumSquare = 0;
        int squareSum = 0;
        
        for (int i = 1; i <= 100; i++) {
            sumSquare += i * i;
            squareSum += i;
        }
        
        squareSum *= squareSum;
        
        long end = System.currentTimeMillis();

        System.out.println(squareSum - sumSquare);
        System.out.println(end - begin + " ms");
    }

}
