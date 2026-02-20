/* 
   Imani Hollie 02/20/2026
   Midterm Project: Part 3 - Parking Charges

   A parking garage charges a $2.00 minimum fee to park for up to three hours.
   The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours.
   The maximum charge for any given 24-hour period is $10.00.
   Assume that no car parks for longer than 24 hours at a time.

   Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday.
   You should enter the hours parked for each customer.

   The program should display:
   - The charge for the current customer
   - Calculate and display the running total of yesterday’s receipts
*/

// Import utility library
import java.util.Scanner; // Scanner class allows use of Scanner object

public class J1MP_3 {
   public static void main(String[] args) {
      // Create Scanner object "input"
      Scanner input = new Scanner(System.in);
      
      // Declare variables
      final double minimumFee = 2.0;
      final double additionalFee = 0.5;
      final double maxCharge = 10.0;
      final int maxHours = 24;
      
      double currentCharge = 0.0;
      double runningCharge = 0.0;
      int runningHours = 0;

      System.out.println("PARKING CHARGES CALCULATOR");
      System.out.println("==========================");
      
      // DO iterations WHILE runningHours is LESS THAN maxHours
      do {
         // Get user input
         System.out.print("Enter Hours Parked (1-24): ");
         int hours = input.nextInt();

         // Validate IF hours is NOT between 1-24 THEN print an ERROR Message

// Loop until total hours entered reach 24 do { System.out.print("Enter hours parked for customer (1–24): "); int hours = input.nextInt(); // Prevent invalid hours if (hours < 1 || hours > 24) { System.out.println("Invalid entry. Hours must be between 1 and 24."); continue; } // Calculate charge if (hours <= 3) { currentCharge = minimumFee; } else { currentCharge = minimumFee + ((hours - 3) * additionalFee); } // Apply maximum charge rule if (currentCharge > maxCharge) { currentCharge = maxCharge; } // Update totals runningHours += hours; runningCharge += currentCharge; // Display charge for this customer System.out.printf("Charge for this customer: $%.2f%n", currentCharge); System.out.printf("Running total for yesterday: $%.2f%n%n", runningCharge); } while (runningHours < maxHours); System.out.println("Maximum total hours reached for the day."); System.out.printf("Final receipts for yesterday: $%.2f%n", runningCharge); input.close();
         
      } while (runningHours < maxHours);
      
      // Output
      
      input.close();  // Close scanner
   }
}
