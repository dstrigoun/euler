package questions$26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * V_NameScores. 
 * Begin by sorting the given file into alphabetical order. Then
 * working out the alphabetical value for each name, multiply this value by its
 * alphabetical position in the list to obtain a name score. Find the total of
 * all the name scores in the file.
 * 
 * @author Doosha
 * @version 12/08/2017
 */
public class V_NameScores {
    /**
     * Drives the program.
     * 
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        try
        {
           @SuppressWarnings("resource")
           Scanner in = new Scanner(new File("src/questions$26/Names.txt")).useDelimiter("[\",]+");
           ArrayList<String> names = new ArrayList<String>();
           while (in.hasNext())
           {
               names.add(in.next());
           }
           Collections.sort(names);
        
           int total = 0;
           for (int i = 0; i < names.size(); i++) {
               int nameSum = 0;
               int product = 0;
               String name = names.get(i);
               for(int m = 0; m <= name.length() - 1; m ++){
                   int x1 = letter_counter(name.charAt(m));
                   nameSum += x1;
               }
               product = nameSum * (i + 1);
               total += product;
           }
           System.out.println(total);
        }
        catch (FileNotFoundException e) {
            System.out.println("Files doesn't exist");
        }
        catch (@SuppressWarnings("hiding") IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin + " ms");
    }

    public static Integer letter_counter(char letter)
    {
        String letterSum = Character.toString(letter);
        Map<String, Integer> letv = new HashMap<String, Integer>();
        letv.put("A", 1);
        letv.put("B", 2);
        letv.put("C", 3);
        letv.put("D", 4);
        letv.put("E", 5);
        letv.put("F", 6);
        letv.put("G", 7);
        letv.put("H", 8);
        letv.put("I", 9);
        letv.put("J", 10);
        letv.put("K", 11);
        letv.put("L", 12);
        letv.put("M", 13);
        letv.put("N", 14);
        letv.put("O", 15);
        letv.put("P", 16);
        letv.put("Q", 17);
        letv.put("R", 18);
        letv.put("S", 19);
        letv.put("T", 20);
        letv.put("U", 21);
        letv.put("V", 22);
        letv.put("W", 23);
        letv.put("X", 24);
        letv.put("Y", 25);
        letv.put("Z", 26);
         
        int lc = letv.get(letterSum);
        return lc;
    }
}
