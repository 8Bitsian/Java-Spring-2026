/* Imani Hollie 01/15/2026
   Lesson 3 Assignment: Create a program to take an integer from a user and determine whether it is even or odd. One program should use an if statement and the other should use a switch statement 

   Sample Output:
   ? 7
   odd
*/

import java.util.Scanner;

public class J103_1_2 { // switch statement
   public static void main(String[] args) {
      // Create a Scanner object
      Scanner input = new Scanner(System.in);

      // Get input for a number
      System.out.print("Number? ");
      int number = input.nextInt();

      // Normalize remainder for negative numbers
      int remainder = Math.abs(number) % 2;

      // Calculate and Display if input is odd or even
      switch (remainder) {
         case 0:
            System.out.println("even");
	    break;
         case 1:
            System.out.println("odd");
	    break;
         default:
            System.out.println("ERROR: Invalid Input");

      input.close();
   }
}

