/* Imani Hollie 02/12/2026
   Lesson 4 Assignment: Find the character of an ASCII code (an integer between 0-127) and displays its character.
   
   Sample Output:
   Enter an ASCII code: 69
   The character for ASCII code 69 is E
*/

// Import libraries
import java.util.Scanner;

public class DisplayASCIIChar {
   public static void main(String[] args) {
      // Create objects
      Scanner input = new Scanner(System.in);

      // Get input for a number
      System.out.print("Enter an ASCII code: ");
      int n = input.nextInt();

      // Validate input (n) is between 0 and 127
      while (n < 0 || n > 127) {
         System.out.print("ERROR: Invalid Input");
         n = input.nextInt();
      }

      // Calculate character for ASCII code
      char asciiChar = (char) n;

      // Output character for ASCII code
      System.out.println("The character for ASCII code " + n + " is " + asciiChar);

      input.close();
   }
}
