// Import libraries
import java.util.Scanner;                       // Allows use of Scanner objects

public class ChineseZodiac {                    // Class 'ChineseZodiac'
    public static void main(String[] args) {    // Method 'main' (Entry Point)
        Scanner input = new Scanner(System.in); // Create Scanner object 'input'

        // Get user input
        System.out.print("Enter a year: "); // Output prompt to console
        int year = input.nextInt();         // Declare variable 'year'

        // Validate year and display appropriate zodiac
        switch (year % 12) {  // Similar to a nested if statment
          case 0 : 
            System.out.println("Monkey");
            break;
          case 1 : 
            System.out.println("Rooster");
            break;
          case 2 : 
            System.out.println("Dog");
            break;
          case 3 : 
            System.out.println("Pig");
            break;
          case 4 : 
            System.out.println("Rat");
            break;
          case 5 : 
            System.out.println("Ox");
            break;
          case 6 : 
            System.out.println("Tiger");
            break;
          case 7 : 
            System.out.println("Rabbit");
            break;
          case 8 : 
            System.out.println("Dragon");
            break;
          case 9 : 
            System.out.println("Snake");
            break;
          case 10 : 
            System.out.println("Horse");
            break;
          case 11 : 
            System.out.println("Sheep");
            break;
        }

        // Close Scanner object 'input'
        input.close();
    }
}   // Exit program
