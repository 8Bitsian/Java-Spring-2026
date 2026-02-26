/* Imani Hollie 01/30/2026
   5-Minute Challenge: Three Methods
   Write a program that prompts the user to input two numbers,
   calculate thier multiplication, and print out the result.
   The program should have three separate methods:
   - userInput()
   - calculation()
   - printout()
   The main() method should be kept as simple as possible.

   Sample Output:
   ? 3.7  11.5
   --------------
   3.7 x 11.5 = ***
*/

import java.util.Scanner;

public class J106_1 {
  public static void main(String[] args) {
    // Call userInput() to get user input
    double number1 = userInput("Enter Number: ");
    double number2 = userInput("Enter Number: ");
    // Call calculation() to multiply user inputs
    double result = calculation(number1, number2);
    // Call printout() to output results
    printout(number1, number2, result);
  }

  public static double userInput(String prompt) {
    // Create Scanner object "input"
    Scanner input = new Scanner(System.in);
    // Get user input
    System.out.print(prompt); // prompt = "Enter Number: "
    return input.nextDouble();
  }

  public static double calculation(double num1, double num2) {
    // Mutliply num1 and num2 to get product
    return num1 * num2;
  }

  public static void printout(double num1, double num2, double result) {
    System.out.println("--------------");
    System.out.println(num1 + " x " + num2 + " = " + result);
  }
}
