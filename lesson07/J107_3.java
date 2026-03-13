/* Imani Hollie 03/13/2026
   Lesson 7 Assignment: Utilize an array to produce an output similar to the sample output below.

   The code should:
   - prompt the user to input a single character (case-sensitive), then compare it with the ten elements in an array
   - if the character is present within the array, display the position(s) of the characters
   - Have the positions start at 1 and end at 10

   Modify the sorting and searching algorithms from the textbook, ensuring your implementation is different.
   Avoid using any built-in methods, such as sort()

   Sample output:
   Guess one character (lowercase) in my array: a
   My array: j a e l a w k v a k
   Good: A is in 2nd and 5th and 9th
   -----------------------------------------------------
   Guess one character (lowercase) in my array: k
   My array: j a e l a w k v a k
   Good: K is in 10th
   -----------------------------------------------------
   Guess one character (lowercase) in my array: u
   My array: j a e l a w k v a k
   Nope.
   -----------------------------------------------------
   Guess one character (lowercase) in my array: -1
   OK done!
*/

import java.util.Scanner;
import java.util.Random;

public class J107_3 {
   private static final int SIZE = 10;                     // Size of the array
   private static final char[] letters = new char[SIZE];   // Array that holds 10 random letters
   private static final Random rand = new Random();        // Random number generator

   // Make 10 random lowercase letters and store them in the array
   public static void genChar() {
      for (int i = 0; i < SIZE; i++) {
         letters[i] = (char)('a' + rand.nextInt(26));
      }
   }

   // Ask the user for one lowercase letter or -1 to quit
   public static String getInput(Scanner sc) {
      while (true) {
         // Get user input
         System.out.print("Guess one character (lowercase) in my array: ");
         String input = sc.nextLine();

         if (input.equals("-1")) { return null; } // Quit the program if -1

         // Accept only one lowercase letter
         if (input.length() == 1 &&
             input.charAt(0) >= 'a' &&
             input.charAt(0) <= 'z") {
            return input;
         }
         System.out.println("ERROR: Enter one lowercase character (a-z)");
      }
   }

   // Look through the array and find all positions where the guess appears
   public static int[] parseArray(char guess) {
      int[] positions = new int[SIZE];  // temporary storage
      int count = 0;                    // how many matches found

      // Check each spot in the array
      for (int i = 0; i < SIZE; i++) {
         if (letters[i] == guess) {
            positions[count] = i + 1;   // store position (1–10)
            count++;
         }
      }

      // Make a new array that fits the number of matches exactly
      int[] result = new int[count];
      for (int i = 0; i < count; i++) {
         result[i] = positions[i];
      }

      return result;
   }

   // Turn numbers into 1st, 2nd, 3rd, 4th, etc.
   public static String ordinal(int num) {
      if (num % 100 >= 11 && num % 100 <= 13) return num + "th";

      switch (num % 10) {
         case 1: return num + "st";
         case 2: return num + "nd";
         case 3: return num + "rd";
         default: return num + "th";
      }
   }

   // Show the array and print where the matches were found
   public static void printMatches(char guess, int[] matches) {
      // Show the array
      System.out.print("My array: ");
      for (int i = 0; i < SIZE; i++) {
         System.out.print(letters[i]);
         if (i < SIZE - 1) System.out.print(" ");
      }
      System.out.println();

      // If no matches were found
      if (matches.length == 0) {
         System.out.println("Nope.");
         return;
      }

      // Print all matching positions
      System.out.print("Good: " + Character.toUpperCase(guess) + " is in ");

      for (int i = 0; i < matches.length; i++) {
         System.out.print(ordinal(matches[i]));
         if (i < matches.length - 1) System.out.print(" and ");
      }
      System.out.println("\n-----------------------------------------------------");
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      genChar();   // Make the random array once

      while (true) {
         // Get the user's guess
         String guessStr = getInput(sc);

         // If user typed -1, stop the program
         if (guessStr == null) {
            System.out.println("OK done!");
            break;
         }
         
         // Find all matching positions
         char guess = guessStr.charAt(0);
         int[] matches = parseArray(guess);

         // Print the results
         printMatches(guess, matches);
      }
   }
}
