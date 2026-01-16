/* Imani Hollie 01/15/2026
   5-Minute Challenge: Use IntelliJ to print out your name 
   and your favorite number on the console

   Sample Output:
   My name is Jane Doe
   7
*/

import java.util.Scanner;  // Allows use of Scanner objects

public class J101_1 {  // Class name
  public static void main(String[] args) {  // Main method

    Scanner input = new Scanner(System.in);  // Create Scanner object

    // Declare variables
    byte number;        // Stores favorite number
    String name;        // Stores user's full name

    // Get user's name
    System.out.print("Name? ");
    name = input.nextLine();  // Reads a full line of text

    // Get user's favorite number
    System.out.print("Favorite Number? ");
    number = input.nextByte();  // Reads a byte value

    // Output user's name and favorite number
    System.out.println("My name is " + name);
    System.out.println(number);

    input.close();  // Close scanner
  }
}
