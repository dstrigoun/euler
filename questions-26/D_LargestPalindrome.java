package questions$26;

/**
 * D_LargestPalindrome.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Doosha
 * @version 31/05/2017
 */
public class D_LargestPalindrome {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int sum;
        int max = 0;
        
        //Forms two numbers, multiplies them and determines if result is palindrome.
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                sum = i * j;
                
                //Finds the largest palindrome.
                if (isPalindrome(sum)) {
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        
        System.out.println(max);
        System.out.println(end - begin + " ms");
    }
    
    /**
     * Determines whether a number is a palindrome.
     * 
     * @param number
     *          potential palindrome
     * @return boolean
     */
    public static boolean isPalindrome(int number) {
        String palindrome = Integer.toString(number);
        
        int left = 0;
        int right = palindrome.length() - 1;

        //Checks to see if char on left is equal to right.
        for (int a = 0; a < String.valueOf(number).length()-1; a++) {
            if (palindrome.charAt(left) != palindrome.charAt(right)) {
                return(false);
            }
            left++;
            right--;
        }
        
        return(true);
    }
}
