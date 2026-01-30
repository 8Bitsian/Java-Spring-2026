/* Imani Hollie 01/30/2026
   Lesson 5 Lab: Write a program to prompt the user to enter a number
   using a do-while loop until they match the generated number
   
   Sample Output:
   ? 0
   ? 7
   Yes!
*/

// Import libraries
import java.util.Scanner;                     //Import the Scanner class for user input
import java.util.Random;                      //Import the Random class for generating secretNum

// Part 3 of Lab Project
public class J105_3 {                         // Define class 'J105_3'
  public static void main(String[] args) {    // Define method 'main'
    // Declare objects
    Scanner input = new Scanner(System.in);   // Create Scanner object 'input'
    Random random = new Random();             // Create Random object 'random'
    
    // Declare variables
    int secretNum = random.nextInt(100) + 1;  // Generate a random number between 1 and 100 (inclusive)
    int guess;                                // Store user's guess (count = initial value;)
    
    do {
      System.out.print("? ");                 // Prompt the user for input
      guess = input.nextInt();                // Read an integer from user input
    } while (guess != secretNum);             // Loop continues if guess does not equal secretNum (count < endValue;)

    System.out.println("Yes!");               // Print when loop terminates
  }
}
