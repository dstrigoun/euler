package questions$26;

/**
 * O_LatticePaths.
 * How many unique routes(lattice paths) are there in a 20 x 20 grid starting
 * from the top left down to the bottom right?
 * 
 * @author Doosha
 * @version 05/08/2017
 */
public class O_LatticePaths {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        
        int n = 20;
        long matrix[][] = new long[n][n];
        
        for (int i = 0; i < n; i++) {
            matrix[i][0] = i + 2;
            matrix[0][i] = i + 2;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {      //j >= i
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                matrix[j][i] = matrix[i][j];   //avoids double computation (difference)
            }
        }
        
        System.out.println(matrix[n - 1][n - 1]);
        
        long end = System.currentTimeMillis();
        
        System.out.println(end - begin + " ms");
    }
}
