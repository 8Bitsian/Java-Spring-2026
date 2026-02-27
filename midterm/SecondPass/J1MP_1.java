/* 
   Imani Hollie 02/20/2026
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

public class J1MP_1 {
   public static void main(String[] args) { // 1. Program execution starts with main() method 
      // Declare and initialize variable
      double totalValue = 0.0;

      // Prompt for user input (Sentinel Value = -1)
      System.out.println("Enter quantity purchased for each product (-1 to EXIT):\n");

      // Loop through product numbers 1-5
      for (int productNumber = 1; productNumber <= 5; productNumber++) {
         // Call getQuantity() to get user input
         int quantitySold = getQuantity(productNumber);
         
         // Check if user enters sentinel value, then break the for loop
         if (quantitySold == -1) break;

         // Call getRetailPrice() to determine the retail price of each product
         double retailPrice = getRetailPrice(productNumber);
         
         // Calculate subtotal and running total
         double subtotal = retailPrice * quantitySold;
         totalValue += subtotal;
         
         // Call displaySubtotal() to show the subtotal for each product
         displaySubtotal(productNumber, subtotal);
      }
      // Call displayTotal() to show the running total for all products
      displayTotal(totalValue)
      input.close();
   }

   public static int getQuantity(int productNumber) { // 2. Get user input for quantity of each product
      // Create Scanner object "input"
      Scanner input = new Scanner(System.in);
      // Get user input of quantity of products bought
      System.out.printf("Enter Quantity of Product %d: ", productNumber);
      return = input.nextInt();
   }
   
   public static double getRetailPrice(int productNumber) { // 3. Determine retail price using switch
      // Determine retail price and total value spent
      switch (productNumber) {
         case 1: return 2.98; // Product 1: $2.98
         case 2: return 4.50; // Product 2: $4.50
         case 3: return 9.98; // Product 3: $9.98
         case 4: return 4.49; // Product 4: $4.49
         case 5: return 6.87; // Product 5: $6.87
         default: return 0.0;
      }
   }

   public static void displaySubtotal(int productNumber, double subtotal) { // 3. Display subtotal for each product
      // Output subtotal for this product
      System.out.printf("Subtotal for Product %d: $%.2f%n%n", productNumber, subtotal);
   }

   public static void displaySubtotal(double totalValue) { // 4. Display running total
      // Output total cost
      System.out.println("=============================================");
      System.out.printf("Total Cost: $%.2f%n", totalValue);
   }
}
