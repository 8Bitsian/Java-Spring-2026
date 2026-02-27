/* Imani Hollie 01/30/2026
   Lesson 6 Lab: Principal Increment
   How many months would it take for a $100,000 principal to double to $200,000,
   if you add 3% of the current value each month?
   - Provide the value each month and demonstrate your calculation process
   - Use your own methods
   - Minimize the main as much as possible
*/

import java.util.Scanner;

public class J106_2 {
  public static void main(String[] args) { // Define method "main"
    // Create Scanner object "input"
    Scanner input = new Scanner(System.in);
    // Get user input
    System.out.print("Enter Principal Amount: $");
    double principalAmount = input.nextDouble();
    // Call calculateGrowth() to see how long it will take
    calculateGrowth(principalAmount);

  }

  public static void calculateGrowth(double principal) {
    // Declare variables
    double currentAmount = principal;
    int month = 0;

    System.out.println("\n=== MONTHLY GROWTH ===");
    System.out.println("=============================================");

    while (currentAmount < principal * 2) {
      month++;
      double added = currentAmount * 0.03;
      double previous = currentAmount;
      currentAmount += added;
      System.out.printf("Month %d: $%,.2f (added $%,.2f)%n", month, currentAmount, added);
      System.out.printf("\tCalculation: %.2f + (%.2f × 0.03)%n", previous, previous);
      System.out.println();
    }
    System.out.println("=============================================");
    System.out.printf("Your principal will be doubled in %d month%s%n",
                       month, (month > 1 ? "s" : ""));
  }
}
