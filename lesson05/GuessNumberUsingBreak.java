
import java.util.Scanner;

public class GuessNumberUsingBreak {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101); // Explicitly cast int data type and multiple value to 101
        // Create Scanner object 'input'
        Scanner input = new Scanner(System.in);

        while (true) { // Start of while loop
            // Prompt the user to guess the number
            System.out.println("Guess a magic number between 0 and 100.");
            int guess = input.nextInt();

            // Validate and output if guess was correct or not
            if (guess == number) {
                System.out.println("Yes the number is " + number);
                break;
            } else if (guess > number)
                System.out.println("Your guess is too high...");
            else
                System.out.println("Your guess is too low...");
        } // End of loop
    }
}
