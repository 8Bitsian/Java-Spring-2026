
import java.util.Scanner;
public class TestDoWhile {
    public static void main(String[] args) {
        int data = 0, sum = 0;

        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print("Enter an integer ends if its is 0: ");
            data = input.nextInt();
            sum += data;
        } while (data != -1);

        System.out.println("The sum is " + sum);
    }
}
