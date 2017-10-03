package questions$26;

/**
 * Q_NumberLetterCounts. 
 * If all the numbers from 1 to 1000 (one thousand)
 * inclusive were written out in words, how many letters would be used?
 * 
 * @author Doosha
 * @version 05/08/2017
 */
public class Q_NumberLetterCounts {
    /**
     * Drives the program.
     * 
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        String word = "";
        int sum = 0;

        //From 1 - 1000, turn number to word
        for (int i = 1; i <= 1000; i++) {
            if (i == 1000) {
                word = "onethousand";
            }
            if (i >= 100 && i <= 999) {
                word = numberToWord(((i / 100) % 10), "hundred");
                if (i % 100 != 0) {
                    word += "and" + numberToWord((i % 100), "");
                }
            }
            if (i <= 99) {
                word = numberToWord((i % 100), "");
            }

            sum += word.length();
        }

        long end = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(end - begin + " ms");
    }

    /**
     * Returns the number as a string.
     * 
     * @param num
     *          Number being transformed
     * @param val
     *          Additional word, (hundred), if necessary
     * @return String
     */
    public static String numberToWord(int num, String val) {
        //arrays of the ones and tens
        String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String tens[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        //displays correct array for given number
        if (num > 19) {
            return tens[num / 10] + "" + ones[num % 10] + val;
        } else {
            return ones[num] + val;
        }
    }
}
