/*
    Imani Hollie 01/21/2026
    Lesson 4 Lab: Write a program that prompts the user to enter
    two alphabet characters. The program will then generate a random
    sequence of five uppercase alphabet characters and compare the
    user's inputs as follows:
    - The first input will be compared to the first character of the sequence
    - The second input will be compared to the last character of the sequence
    Display whether each input is correct/incorrect and show the sequence for reference

    Credit to @ElementalMagicksCardGame on Twitch

    Sample Output:
        ? JV
        Both are wrong
        Generated sequence: WDOKP // You should compare J with W, V with P
        ? AL
        The first one is correct
        Generated sequence: ADPBP // You should compare A with A, L with P
*/

import java.util.Scanner;   // Allows use of Scanner objects
import java.util.Random;    // Allows use of Random objects

public class J104_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object 'input'
        Random rand = new Random();              // Create Random object 'rand'

        // Get user input
        System.out.print("? ");  // Outputs to console
        String guess = input.nextLine(); // Reads full line of text

        // Output ERROR Message IF input is NOT 2 uppercase characters
        if (!(guess.length() == 2 &&                    // Validates length is 2 AND
              Character.isLetter(guess.charAt(0)) &&    // Validates first character is letter AND
              Character.isLetter(guess.charAt(1)))) {   // Validates second character is letter
            System.out.println("ERROR: Invalid Input"); // Output ERROR Message
            System.exit(1);                       // Exit program
        }

        guess = guess.toUpperCase(); // Formats string w/uppercase letters

        // Generate 5 uppercase characters
        String generated = ""; // Initialize string
        int i = 0; // Initialize i

        do {
            int letter = rand.nextInt(26) + 'A'; // 0 - 25 (26) as 'A' - 'Z'
            generated += Character.toString(letter); // char = int16 so use Character.toString() w/ letter as argument
            i++; // Increment i
        } while (i < 5);

        // generated = "ABCDE;"; // Test line

        System.out.println("Generated Sequence: " + generated);

        boolean match1 = guess.charAt(0) == generated.charAt(0);
        boolean match2 = guess.charAt(1) == generated.charAt(4);

        // Compare guess to generated
        if (match1 && match2) { // If both true
            System.out.println("Both are correct");
        } else if (match1) { // If first true
            System.out.println("The first one is correct. Try again.");
        } else if (match2) { // If second true
            System.out.println("The second one is correct. Try again.");
        } else { // If both false;
            System.out.println("Both are false. Try again.");
        }

        input.close();  // Close 'input'
    }
}  // End of program
