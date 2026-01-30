// Import libraries
import java.util.Scanner;                       // Allows use of Scanner objects

public class DayOfTheWeek {                     // Class 'DayOfTheWeek'
    public static void main(String[] args) {    // Method 'main' (Entry Point)
        Scanner input = new Scanner(System.in); // Create Scanner object 'input'

        // Get user input
        System.out.print("Enter day of the week: "); // Output prompt to console
        int day = input.nextInt();                   // Declare variable 'day'

        // Validate day and display appropriate title
        String dataType = switch(day) {
          case 1, 7 -> {
            System.out.println("It's the weekend!");
            yield "Weekend";
          }
          case 2, 3, 4, 5, 6 -> {  // -> Functional Model
            System.out.println("It's a weekday...");
            yield "Weekday";  // Yeild is similar to a return statement
          }
          default -> "Unknwon";
        }

        // Close Scanner object 'input'
        input.close();
    }
}   // Exit program
