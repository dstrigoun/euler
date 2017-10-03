package questions$26;

import java.math.BigInteger;
/**
 * T_FactorDigitSum.
 * Find the sum of the digits in 100!.
 * 
 * @author Doosha
 * @version 10/08/2017
 */
public class T_FactorDigitSum {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        BigInteger bigNumber = BigInteger.valueOf(1);
        
        //Goes from 1 - 100, and multiplies each BigInteger into
        //itself.
        for (int i = 100; i >= 1; i--) {
            bigNumber = bigNumber.multiply(BigInteger.valueOf(i)); 
        }

        String stringNumber = bigNumber.toString();
        long sum = 0;
        
        //Adds each character from the string to sum.
        for (int i = 0; i < stringNumber.length(); i++) {
            sum += Character.getNumericValue(stringNumber.charAt(i));
        }
        
        long end = System.currentTimeMillis();

        System.out.println(sum);
        System.out.println(end - begin + " ms");
    }
}
