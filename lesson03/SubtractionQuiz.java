// Import libraries
import java.util.Scanner;                       // Allows use of Scanner objects

public class SubtractionQuiz {                  // Class 'SubtractionQuiz'
    public static void main(String[] args) {    // Method 'main' (Entry Point)
        // Generate two random numbers
        int num1 = (int)(Math.random() * 10);   // Math.random() returns double so cast int
        int num2 = (int)(Math.random() * 10);   // Multiplies 0.# by 10 so it's a single digit

        // Format output by switching places
        if (num1 < num2) {
          int temp = num1;  // Declare variable 'temp'
          num1 = num2;
          num2 = temp;
        }

        // Get user input
        System.out.print("What is: " + num1 + " - " + num2 + "? "); // Output prompt to console
        Scanner input = new Scanner(System.in); // Create Scanner object 'input'
        int answer = input.nextInt();           // Declare variable 'answer'

        // Validate answer and display appropriate ouput
        if (num1 - num2 == answer) {
          System.out.println("Your answer is correct!");
        } else {
          System.out.println("Your answer is wrong...");
          System.out.println(num1 + " - " + num2 + " should be " + (num1 + num2));
        }

        // Close Scanner object 'input'
        input.close();
    }
}   // Exit program
