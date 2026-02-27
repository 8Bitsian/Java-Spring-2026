/* 
   Imani Hollie 02/20/2026
   Midterm Project: Part 2 - Acount Saving Checking
   A bank in your towns updates its customers' accounts at the end of each month.
   The bank offers two types of accounts: Savings and Checking.
   Every customer must maintain a minimum balance or they will be penalized with a service charge as follows:
   - $10.00 for savings
   - $25.00 for checking

   If the balance at the end of the month is at least the minimum, the accout recieves iterest as follows:
   - 4% interest for savings
   - Checking accounts w/balanace of up to $5,000 more than the minumum recieve 3% interest; Otherwise, the interest is 5%

   Write a program that reads:
   - a customer’s account number (int type)
   - account type (char type; S for savings and C for checking)
   - minimum balance that the account should maintain
   - current balance

   The program should then output:
   - The account number
   - Account type
   - Current balance and new balance
   - Or an appropriate error message

   Test your program by running it five times, by using proper the following data:
   46728 S 1000 2700 
   87324 C 1500 7689 
   873 S 1000 800 
   89832 C 2000 3000 
   98322 C 1000 750
*/

// Import utility library
import java.util.Scanner; // Scaner class allows use of Scanner object

public class J1MP_2 {
   public static void main(String[] args) {
      // Create objects
      Scanner input = new Scanner(System.in);

      // Declare variables
      int accountNumber;
      char accountType = 'a';
      double minimumBalance = 0.0;
      double currentBalance = 0.0;

      // While loop iterates until 
      while (true) {
         // Get user's input (Sentinel Value = -1)
         System.out.println("======================================");
         System.out.println("Enter Banking Information (-1 to EXIT)");

         // Iterate getting the account number while user input is true
         while (true) {
            // Get account number
            System.out.print("Enter Account Number: ");
            accountNumber = input.nextInt();

            // Validate IF account number is -1 THEN return to the main method
            if (accountNumber == -1) {
               input.close(); // Close Scanner object
               System.out.println("Exiting...");
               return; // Return to main method
            }

            // Validate IF account number is 1-5 digits THEN break while loop
            if (accountNumber >= 1 && accountNumber <= 99999) {
               break;
            } // ELSE print ERROR message and iterate
            System.out.println("ERROR: Invalid Input - Account number must be 1-5 digits.");
         }
         
         // Iterate getting the account type while user input is true
         while (true) {
            // Get account type
            System.out.print("Enter Account Type (S or C): ");
            accountType = input.next().toUpperCase().charAt(0);
            // next() reads the next string the user inputs
            // toUpperCase() converts string to uppercase
            // charAt() extracts the first character of the string

            // Validate IF account number is 'S' OR 'C' THEN break while loop
            if (accountType == 'S' || accountType == 'C') {
               break;
            } // ELSE print ERROR message and iterate
            System.out.println("ERROR: Invalid Input - Account type must be 'S' or 'C'.");
         }

         // Get the minimum balance for the account
         System.out.print("Enter Minimum Balance: $");
         minimumBalance = input.nextDouble();

         // Get the current balance of the account
         System.out.print("Enter Current Balance: $");
         currentBalance = input.nextDouble();

         double newBalance = currentBalance;
         double serviceCharge = 0.0;
         double interest = 0.0;
         
         switch (accountType) {
            case 'C': // Checking account
               // IF currentbalance is LESS THAN mimimumBalance ($0), THEN serviceCharge = 25.0
               if (currentBalance < minimumBalance) {
                  serviceCharge = 25.0;
                  newBalance -= serviceCharge;
               // ELSE IF currentBalance is LESS THAN OR EQUAL TO $5,000, THEN interest is 3%
               } else if (currentBalance <= 5000){
                  interest = currentBalance * 0.03;
                  newBalance += interest;
               // ELSE currentBalance is GREATER THAN $5,000, THEN interest is 5%
               } else {
                  interest = currentBalance * 0.05;
                  newBalance += interest;
               }
               break; // Break switch statement
               
            case 'S': // Savings account
               // IF currentBalance is LESS THAN minimumBalance ($0), THEN serviceCharge = 10.0
               if (currentBalance < minimumBalance) {
                  serviceCharge = 10.0;
                  newBalance -= serviceCharge;
               // ELSE currentBalance is GREATER THAN minimumBalance ($0), THEN interest = 4%
               } else {
                  interest = currentBalance * 0.04;
                  newBalance += interest;
               }
               break;
         }

         // Output account summary
         System.out.println("\n--- ACCOUNT SUMMARY ---");
         System.out.println("Account Number: " + accountNumber);
         System.out.println("Account Type: " + accountType);
         System.out.printf("Current Balance: $%.2f%n", currentBalance);
         System.out.printf("New Balance: $%.2f%n", newBalance);
         System.out.println();
      }
   }
}
