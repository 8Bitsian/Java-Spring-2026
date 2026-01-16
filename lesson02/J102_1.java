/* Imani Hollie 01/15/2026
   5-Minute Challenge: Write a program that takes user input for a name
   and the last 4 digits of a phone number from the keyboard,
   then prints them to the console.
   
   Sample Output:
   Name? Jane Doe
   Last 4-digit phone number? ****
   Your name: Jane Doe
   Last 4-digit phone number: ****
*/

import java.util.Scanner;  // Allows use of Scanner objects

public class J102_1 {  // Class name
  public static void main(String[] args) {  // Main method

    Scanner input = new Scanner(System.in);  // Create Scanner object

    // Declare variables
    String name;        // Stores user's full name
    short phone;        // Stores favorite number

    // Get user's name
    System.out.print("Name? ");  // Prompt asking user's name
    name = input.nextLine();  // Reads a full line of text

    // Get user's last 4-digits of phone number
    System.out.print("Last 4-digit phone number? ");  // Prompt asking for the user's phone number
    phone = input.nextShort();  // Reads a short (int) value

    // Validate phone number is 4 digits
    while (phone < 0 || phone > 9999) {            // While loop that ensures the number is between 0000 and 9999
      System.out.println("ERROR: Invalid Input");  // Error message for invalid input
      System.out.print("Enter 4 Digits: ");        // Prompt asking user to try again
      phone = input.nextShort();                   // Reads new input
    }

    // Output user's name and favorite number
    System.out.println("Your name: " + name);  // Prints user's name to the console
    System.out.println("Last 4-digit phone number: " + phone);  // Print's user's phone to the console

    input.close();  // Close scanner
  }
}
