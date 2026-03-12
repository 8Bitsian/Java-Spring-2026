import java.util.Scanner;

public class SumValues {
    public static void main(String[] args) {
        // Create Scanner object 'input'
        Scanner input = new Scanner(System.in);
        // Declare and initialize 'myList' array with size of 5
        double[] myList = new double[5];

        // Get user input
        System.out.println("Enter " + myList.length + " values: ");
        // input for loop and insert values into
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
            System.out.println("Value " + myList.length + ": " + myList[i]);
        }

        // Calculate all elements within an array
        double sum = myList[0];
        for (int i = 0; i < myList.length; i++) {
            sum += myList[i];
        }
        System.out.println("Sum: " + sum);

        // Calculate the largest element within an array
        double max = myList[0];
        for (int i = 1; i < myList.length; i ++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max: " + max);

        // Calculate the smallest element within an array
        double min = myList[0];
        for (int i = 1; i < myList.length; i ++) {
            if (myList[i] < min) min = myList[i];
        }
        System.out.println("Min: " + min);
    }
}
