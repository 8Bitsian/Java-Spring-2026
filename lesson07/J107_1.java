/* Imani Hollie 01/15/2026
   Lesson 7 Assignment: Generate 20 random uppercase and lowercase letters, store them in an array, and print them.

   The code should have two methods:
   - genChar to generate the characters and store them in an array
   - printChar to print the characters stored in the array

   The main() methods should be kept as simple as possible
*

import java.util.Random;

public class J107_1 {

   // Constants and shared storage for whole class
   private static final int SIZE = 20; // how many letters to generate
   private static final char[] letters = new char[SIZE]; // array to hold characters
   private static final Random rand = new Random(); // Random object to generate values

   // Fills the global 'letters' array with random characters
   public static void genChar() {
      int i = 0; // index into the letters array
      // Generate and store random characters
      while (i < SIZE) {
         boolean upper = rand.nextBoolean(); // Choose upper/lower case
         char base = upper ? 'A' : 'a'; // base character for upper/lower cases
         letters[i] = (char) (base + rand.nextInt(26)); // pick a random letter within the alphabet (0 - 25) then add to base
         i++; // increment index
      }
   }

   // Prints the characters stored in the 'letters' array by 5
   public static void printChar() {
      int i = 0; // index for reading the letters array
      // Print the characters
      while (i < SIZE) {
         System.out.print(letters[i]);
         // Print a space after each character excluding the 5th
         if ((i + 1) % 5 != 0 && i < SIZE - 1) {
            System.out.print(" ");
         }
         // After every 5 characters, break the line
         if ((i + 1) % 5 == 0) {
            System.out.println(); // break the line
         }

         i++; // increment index
      }
   }

   public static void main(String[] args) {
      // Call methods
      genChar(); // Generate and store 20 random letters
      printChar(); // Print them 5 per line
   }
}
