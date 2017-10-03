package questions$26;

/**
 * S_CountingSundays.
 * How many Sundays fell on the first of the month 
 * during the twentieth century (1 January 1901 to 31 December 2000)?
 * 
 * @author Doosha
 * @version 10/08/2017
 */
public class S_CountingSundays {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int day = 2;    //January 1st 1901 is a Tuesday.
        int sundays = 0;//Counting the amount of sundays.
        
        for (int i = 1901; i < 2001; i++) {
            for (int month = 1; month <= 12; month++) {
                if (day == 7) {
                    sundays++;
                }
                //January, March, May, July, August, October, December
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    day += 3;
                }
                //April, June, September, November
                else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    day += 2;
                }
                //February on a leap year
                else if (month == 2 && isLeapYear(i)) {
                    day += 1;
                }
                if (day > 7) {
                    day -= 7;
                }
            }
        }
        
        long end = System.currentTimeMillis();
        System.out.println(sundays);
        System.out.println(end - begin + " ms");
    }
    
    /**
     * Determines if a year is a leap year.
     * 
     * @param year
     *          Year being determined
     * @return boolean
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) 
            return true;
        else if (year % 100 == 0)
                return false;
        else if (year % 400 == 0)
                return true;
        
        return false;
    }
}
