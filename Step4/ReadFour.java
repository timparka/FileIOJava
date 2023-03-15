package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) {
            // Print out a running total of all the
            // values in the input file.
            try {
                Scanner fileIn = new Scanner(new File("input.txt"));
                int sum = 0;
                while (fileIn.hasNext())
                {
                    // Reads the entire line as a string
                    String lineIn = fileIn.nextLine();
                    int num = Integer.parseInt(lineIn);
                    sum += num;
                    System.out.println("Running total: " + sum);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}