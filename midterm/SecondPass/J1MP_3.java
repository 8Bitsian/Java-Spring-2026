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
   public static void main(String[] args) { // 1. Program execution starts with main() method
      // Create Scanner object "input"
      Scanner input = new Scanner(System.in);
      
      // Declare variables
      double runningReceipts = 0.0;
      int customerCount = 0;

      // Get user's input (Sentinel Value = -1)
      System.out.println("PARKING CHARGES CALCULATOR");
      System.out.println("==========================");
      System.out.println("Enter hours parked for each customer (-1 to EXIT).\n");
      
      while (true) {
         // Call getHours() to get user input
         int hours = getHours(input);

         // Validate IF hours is -1 THEN break while loop
         if (hours == -1) {
            System.out.println("Exiting...");
            break;
         }

         // Call calculateCharge() to get the current running fee
         double currentCharge = calculateCharge(hours);
         
         // Update totals
         runningReceipts += currentCharge;
         customerCount++;

         // Call displayResults() to output Parking Prices
         displayResults(customerCount, hours, currentCharge, runningReceipts);
      }
      input.close();
   }

   public static int getHours(Scanner input) { // 2. Iterate getting hours customer parks WHILE user input is TRUE (NOT -1)
      // Declare constants
      final int MAX_HOURS = 24; // No car parks more than 24 hours
      // Iterate getting user input while true
      while (true) {
         // Get hours customer parked
         System.out.print("Enter Hours Parked (0-24): ");
         int hours = input.nextInt();

         // Validate IF hours is -1 THEN return to main method
         if (hours == -1) { return -1; }
         // Validate IF hours range is 0-24 THEN break while loop
         if (hours >= 0 && hours <= MAX_HOURS) { return hours; }
         // ELSE print ERROR message and iterate
         System.out.println("ERROR: Invalid Input - Hours must be value from 0 to 24 (inclusive).\n");
      }
   }

   public static double calculateCharge(int hours) { // 3. Calculate current charge
      // Declare constants
      final double MIN_FEE = 2.0;      // $2.00 for up to 3 hours
      final double ADD_RATE = 0.5;     // $0.50 per hour or part thereof beyond 3 hours
      final double MAX_CHARGE = 10.0;  // $10.00 is the daily maximum
      final int MIN_HOURS = 3;         // Minimum hour threshold

      // Validate IF hours is equal to 0 THEN currentCharge is $0.00
      if (hours == 0) { return 0; }

      // Validate IF hours is <= to MIN_HOURS (3) THEN currentCharge is MIN_FEE ($2.00)
      if (hours <= MIN_HOURS) { return MIN_FEE; }

      // ELSE calculate current charge w/extraHours multiplied by the ADD_RATE ($0.50)
      // Beyond 3 Hours: Each hour OR PART thereof counts as a full hour
      double extraHours = Math.ceil(hours - MIN_HOURS); // Round up w/Math.ceil() 
      double charge = MIN_FEE + (extraHours * ADD_RATE);

      return Math.min(charge, MAX_CHARGE);
   }

   public static void displayResults(int customerCount, int hours, double charge, double total) { // 4. Output charge and running total
      System.out.printf("Customer #%d | Hours: %d | Charge: $%.2f%n", customerCount, hours, charge);
      System.out.printf("Running total for yesterday: $%.2f%n%n", total);
   }
}
