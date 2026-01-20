/* Imani Hollie 01/15/2026
   Lesson 4 Assignment: Take a number (n) from a user and generate "n" number of random characters. 1 <= n <= 5

   Sample Output:
   ? 5
   s D f r X
*

// Import libraries
import java.util.Scanner;
import java.util.Random;

public class J104_1 {
   public static void main(String[] args) {
      // Create objects
      Scanner input = new Scanner(System.in);
      Random rand = new Random(); // Create a Random object

      // Get input for a number
      System.out.print("Number? ");
      int n = input.nextInt();

      // Validate input (n) is between 1 and 5
      while (n < 1 || n > 5) {
         System.out.print("ERROR: Invalid Input")
         n = input.nextInt();
      }

      // Generate and output random characters
      int generated = 0
      while (generated < n) {
         // Randomly choose upper or lower case
         boolean upper = rand.nextBoolean();

         // Generate a letter
         char base = upper ? 'A' : 'a';
         char letter = (char) (base + rand.nextInt(26));

         // Print with spaces
         System.out.print(letter);
         if (generated < n - 1) {
            System.out.print(" ");
         }
         generated++;
      }
      System.out.println(); // end the line

      input.close();
   }
}