package questions$26;

import java.math.BigInteger;

/**
 * P_PowerDigits.
 * What is the sum of the digits from the product of 2^1000?
 * 
 * @author Doosha
 * @version 05/08/2017
 */
public class P_PowerDigits {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int sum = 0;
        
        //BigInteger for the product of 2^1000
        BigInteger product = new BigInteger("2").pow(1000);
        
        //Change to a string
        String number = product.toString();
        
        //For every character, get the numeric value and add to sum
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println(product);
        System.out.println(sum);
        System.out.println(end - begin + " ms");
    }
}
