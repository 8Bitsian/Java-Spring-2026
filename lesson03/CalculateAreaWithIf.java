// Import libraries
import java.util.Scanner;                       // Allows use of Scanner objects

public class ComputeArea {                      // Class 'ComputerArea'
    public static void main(String[] args) {    // Method 'main' (Entry Point)
        // Create objects
        Scanner input = new Scanner(System.in); // Create Scanner object 'input'

        // Get user input
        System.out.print("Enter Radius: ");     // Output prompt to console
        double radius = input.nextDouble();     // Declare variable 'radius'

        // Validate with If-Else Statement
        if (radius > 0) { // If TRUE output area
          // Compute the area and declare 
          double area = Math.pow(radius, 2) * Math.PI;
          // Output area of circle
          System.out.println("The area for " + radius + " is: " + area);
        } else {         // Else FALSE output error message
          System.out.println("ERROR: Invalid Input");
          System.out.println("Enter a Positive Value Greater Than 0.");
        }

        // Close Scanner object 'input'
        input.close();
    }
}   // Exit program
