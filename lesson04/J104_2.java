/*
   Imani Hollie 01/20/2026\
   // Credit to @ElementalMagicksCardGame on Twitch for calcs
   Lesson 4 Lab: Convert a positive number as either days or seconds:
   - If user selects Day (1), the input represents days
     The program converts the given days into years, months and days, assuming:
     - 1 year = 365 days
     - 1 month = 30 days
   - If user selects Time (2), the input represents seconds
     The program converts the given days into hours, minutes and seconds, assuming:
     - 1 hour = 3600 seconds
     - 1 minute = 60 seconds

   Sample Output:
   Day (1) or Time (2)? 1
   ? 123456789
   Your day is *** years *** months and *** days

   Day (1) or Time (2)? 2
   ? 123456789
   Your day is *** hours *** minutes and *** seconds
*/

import java.util.Scanner;  // Allows use of Scanner objects
public class J104_2 {      // J104_2 Class
    public static void main(String[] args) {  // Program enters here
        Scanner input = new Scanner(System.in);  // Create Scanner object 'input'

        // Get user input
        System.out.print("Day (1) or Time (2)? ");
        byte option = input.nextByte();

        switch (option) {
            case 0: // Exit program
                System.out.println("Exit Program");
                break;
            case 1: // Day
                // Get user input for number of days
                System.out.print("? ");
                int numDays = input.nextInt();

                // Calculate for years, months, and days
                int years = numDays / 365; // Years
                int dayOfYear = numDays % 365; // Remainder for next calc
                int months = dayOfYear / 30; // Months
                int dayOfMonth = dayOfYear % 30; // Remainder of days

                // Output: Your day is *** year(s) *** months and *** days.
                System.out.printf("Your days are %d year(s) %d month(s) and %d day(s).\n", years, months, dayOfMonth);
                break;
            case 2: // Time
                // Get user input for number of seconds
                System.out.print("? ");
                int numSeconds = input.nextInt();

                // Calculate for hours, months, and days
                int hours = numSeconds / 3600; // Hours
                int secOfHr = numSeconds % 3600; // Remainder for next calc
                int minutes = secOfHr / 60; // Minutes
                int secOfMin = secOfHr % 60; // Remainder of seconds

                // Output: Your day is *** hours *** minutes and *** seconds.
                System.out.printf("Your seconds are %d hour(s) %d minute(s) and %d second(s).\n", hours, minutes, secOfMin);
                break;
            default: // ERROR Message
                System.out.println("ERROR: Invalid Input");
                System.exit(1);
        }

        // Program logic
        input.close();  // Close 'input'
    }
}  // End of program
