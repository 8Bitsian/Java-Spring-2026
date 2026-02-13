
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101); // Explicitly cast int data type and multiple value to 101

        // Prompt the user to guess the number
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1; // Initialize the variable
        while (guess != number) { // Start of loop body
            // Get the user input
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            // Validate and output if guess was correct or not
            if (guess == number)
                System.out.println("Yes the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high...");
            else
                System.out.println("Your guess is too low...");
        } // End of loop
    }
}
