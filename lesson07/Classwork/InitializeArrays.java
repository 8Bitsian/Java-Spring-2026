/* Imani Hollie 03/12/2026
   Lesson 7 Classwork
*/
import java.util.Scanner;

public class InitilizeArrays {
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
  }
}
