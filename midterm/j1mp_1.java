/* 
   Imani Hollie 01/30/2026
   Midterm Project: Part 1 - Calculating Sales
   An online retailer sells 5 products whose retail prices are as follows:
  - Product 1: $2.98
  - Product 2: $4.50
  - Product 3: $9.98
  - Product 4: $4.49
  - Product 5: $6.87

  Write an application that reads a series of a pair of numbers as follows:
  - Product Number
  - Quantitiy Sold

  Your program should use a switch statement to determine the retail price for each product.
  It should calculate and display the total retail value of all products sold.
  Use a sentinel-controlled loop to determine when the program should stop looping and display the final results.
*/

// Import utility library
import java.util.Scanner; // Scanner class allows use of Scanner object

public class Main {
  public static void main(String[] args) {
    // Create Scanner object "input"
    Scanner input = new Scanner(System.in);

    // Declare variables
    int quantitySold;
    double retailPrice = 0.0;
    double subtotal = 0.0;
    double totalValue = 0.0;

    // Get user's input (Sentinel Value = -1)
    System.out.println("Enter quantity purchased for each product (-1 to EXIT):\n");
    
    // Loop through product numbers 1-5
    for (int productNumber = 1; productNumber <= 5; productNumber++) {
      // Prompt user to enter quantity of products bought
      System.out.printf("Enter Quantity of Product %d: ", productNumber);
      quantitySold = input.nextInt();

      // Sentinel check
      if (quantitySold == -1) { break; }

      // Calculate retail price and total value spent
      switch (productNumber) {
        case 1: // Product 1: $2.98
          retailPrice = 2.98;
          break;
        case 2: // Product 2: $4.50
          retailPrice = 4.50;
          break;
        case 3: // Product 3: $9.98
          retailPrice = 9.98;
          break;
        case 4: // Product 4: $4.49
          retailPrice = 4.49;
          break;
        case 5: // Product 5: $6.87
          retailPrice = 6.87;
          break;
        default:
          retailPrice = 0.0;
      }

      // Calculate subtotal and total
      subtotal = retailPrice * quantitySold;
      totalValue += subtotal;

      // Output subtotal for this product
      System.out.printf("Subtotal for Product %d: $%.2f%n%n", productNumber, subtotal);
    }
    
    // Output total cost
    System.out.println("=============================================");
    System.out.printf("Total Cost: $%.2f%n", totalValue);

    input.close();  // Close scanner
  }
}
