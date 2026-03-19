/* Imani Hollie 03/19/2026
   Lesson 8 Assignment: Write a program that uses a loop to initialize a 2D array column-wise with the data below:
   1 4 7 10 13 → Row-wise
   2 5 8 11 14
   3 6 9 12 15 ↓ Column-wise
   
   The code should have two methods:
   - genArr to generate the array
   - printArr to print out the array row-wise
*/

public class J108_1 {
   // Global Constants and Vairables
   private static final int ROWS = 3;
   private static final int COLS = 5;
   private static final int[][] array = new int[ROWS][COLS];

   // Fille the array column-wise
   public static void genArr() {
      int value = 1; // Start counting from 1
      // Outer loop: Columns first (column-wise filling)
      for (int c = 0; c < COLS; c++) {
         // Inner loop: Rows second
         for (int r = 0; r < ROWS; r++) {
            array[r][c] = value;
            value++; // Move to next number
         }
      }
   }

   // Print the array row-wise
   public static void printArr() {
      // Outer loop: Rows first (row-wise printing)
      for (int r = 0; r < ROWS; r++) {
         // Inner loop: Columns second
         for (int c = 0; c < COLS; c++) {
            System.out.print(array[r][c] + " ");
         }
         System.out.println(); // Move to next row
      }
   }
   
   public static void main(String[] args) {
      // Call methods
      genArr();
      printArr();
   }
}
