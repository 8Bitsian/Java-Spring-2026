/* Imani Hollie 03/15/2026
  Lab Assignment: Reverse the numbers entered
  Write a program that reads 10 integers then displays them in the reverse order in which they were read.

  Sample Output:
  Read a number: 2
  ...
  Read a number: 90
  The reversal of the input is 90 ... 2
*/

/* Imani Hollie 03/15/2026
   Lab Assignment: Reverse the numbers entered
   Write a program that reads 10 integers then displays them
   in the reverse order in which they were read.
*/

import java.util.Scanner;

public class ReverseIt {
  private static final int SIZE = 10;
  private static double[] numbers = new double[SIZE];

  // Get user input 10 times to fill 'numbers' array
  public static boolean getInput(Scanner input) {
    for (int i = 0; i < SIZE; i++) {
      System.out.print("Read a number (X to exit): ");
      // Validate if user enters double, X, or need to print error message
      if (input.hasNextDouble()) {
        numbers[i] = input.nextDouble();
      } else {
        String token = input.next();
        if (token.equalsIgnoreCase("X")) {
          return false; // False = 0
        } else {
          System.out.println("ERROR: Invalid Input - Please enter a number");
          i--; // Redo this index
        }
      }
    }
    return true; // Sucessfully filled the array
  }

  // Reverse the array
  public static void reverseArray() {
    for (int i = 0; i < SIZE / 2; i++) {
      double temp = numbers[i];
      numbers[i] = numbers[SIZE - 1 - i];
      numbers[SIZE - 1 - i] = temp;
    }
  }

  // Print the reversed array
  public static void printReversed() {
    System.out.print("The reversal of the input is: ");
    for (int i = 0; i < SIZE; i++)
      System.out.print(numbers[i] + " ");
    System.out.println();
  }

  // Program execution starts here
  puble static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      // Call getInput and check if exit sentinel is returned
      if (!getInput(input)) {
        System.out.println("Exiting program...");
        break;
      }
      // Call methods
      reverseArray();
      printReversed();
    }
  }
}
