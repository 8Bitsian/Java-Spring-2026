// Import libraries
import java.util.Scanner;                       // Allows use of Scanner objects

public class ComputeArea {                      // Class 'ComputerArea'
    public static void main(String[] args) {    // Method 'main' (Entry Point)
        // Create objects
        Scanner input = new Scanner(System.in); // Create Scanner object 'input'

        // Declare constants
        // final double PI = 3.14159;           // Declare constant w/final and name all caps

        // Get user input
        System.out.print("Enter Radius: ");     // Output prompt to console
        double radius = input.nextDouble();     // Declare variable 'radius'

        // Calculate the area of a circle
        double area = Math.pow(radius, 2) * Math.PI; // Declare variable 'area' w/Math.pow(a,b) and Math.PI

        // Output area of circle
        System.out.println("The area for " + radius + " is: " + area);

        // Close Scanner object 'input'
        input.close();
    }
}   // Exit program
