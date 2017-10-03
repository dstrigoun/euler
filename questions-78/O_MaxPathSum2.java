package questions$78;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * O_MaxPathSum2.
 * *Same as problem 18/R*
 * 
 * @author Doosha
 * @version 11/08/2017
 */
public class O_MaxPathSum2 {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();
        
        String s = "src/questions$78/BigTriangle.txt";
        int Triangle[][] = FileRead(s);     //stores the values of the file in a 2d array
        
        int lines = Triangle.length;        //should be 15, for 15 rows
    
        //Splits triangle into smaller triangles and searches for max.
        for (int i = lines - 2; i >= 0; i--) {
           for (int j = 0; j <= i; j++) {
               Triangle[i][j] += Math.max(Triangle[i+1][j], Triangle[i+1][j+1]);
           }
        }

        long end = System.currentTimeMillis();
        
        System.out.println(Triangle[0][0]); //prints the max solution
        System.out.println(end - begin + " ms");
    }
    
    /**
     * Stores the values from the file in a 2d array.
     * 
     * @param Filepath
     *          Where the file is stored
     * @return 2d array
     * @throws IOException
     */
    public static int[][] FileRead(String Filepath)throws IOException {   
        int Triangle[][] = {{0},{0}};
        //Need to work on reading files.
        try {
            FileReader fr = new FileReader(Filepath);
            FileReader fr2 = new FileReader(Filepath);
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);
      
            String S;
            String Sline[];
            int lines =0;
      
            while((S = br.readLine()) != null) {
                lines++; 
            }
      
            Triangle = new int[lines][lines];
            Sline = new String[lines];
      
            int j = 0;
      
            while ((S = br2.readLine())!= null) { 
                Sline = S.split(" ");
                
                for(int i = 0; i < Sline.length; i++) {
                    Triangle[j][i] = Integer.parseInt(Sline[i]);
                }
                j++;
            }
      
            fr.close(); 
            br2.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Error reading file");
        }
     
        return Triangle;
    }
}
