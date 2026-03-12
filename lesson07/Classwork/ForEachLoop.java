import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        // Create Scanner object 'input'
        Scanner input = new Scanner(System.in);
        // Declare and initialize 'myList' array with size of 5
        double[] myList = new double[5];
        // Get user input
        System.out.println("Enter " + myList.length + " values: ");
        // input for loop and insert values into
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();
        // Enhanced for-each loop
        for (double value: myList)
            System.out.print(value + ", ");
        System.out.println();
    }
}
