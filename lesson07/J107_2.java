/* Imani Hollie 03/13/2026
   Lesson 7 Assignment: Utilize an array to produce an output similar to the sample output below.

   The code should:
   - prompt the user to input 10 upper- and lower-case letters
   - use an algorithm to sort the characters in the array
   - have comments to indicate where modifications were made to the textbook algorithm

   odify the sorting and searching algorithms from the textbook, ensuring your implementation is different.
   Avoid using any built-in methods, such as sort()

   Sample output:
   10 upper or lowercase characters? j K L e w F v m p X
   Ascending(1) or Descending(2) order? 1
   =============
   Your array: j K L e w F v m p X
   Ascending : e F j K L m p V w X
   -----------------------------------------------------
   10 upper or lowercase characters? j K L e w F v m p X
   Ascending(1) or Descending(2) order? 2
   =============
   Your array: j K L e w F v m p X
   Decending : X w V p m L K j F e
   -----------------------------------------------------
   10 upper or lowercase characters? 0
   OK done!
*/

import java.util.Scanner;

public class J107_2 {
  private static final int SIZE = 10;                    
  private static final char[] letters = new char[SIZE];

  // Get user input to fill the 'letters' array
  public static boolean getInput(Scanner sc) {
    System.out.print("10 upper or lowercase characters? ");
    String input = sc.nextLine();

    // Exit condition
    if (input.equals("0")) {
      System.out.println("OK done!");
      return false;
    }

    // Split input into characters
    String[] parts = input.split(" ");

    // Validate count
    if (parts.length != SIZE) {
      System.out.println("ERROR: Invalid Input - Enter 10 characters separated by spaces.");
      return getInput(sc); // Retry
    }

    // Store characters
    for (int i = 0; i < SIZE; i++) {
      letters[i] = parts[i].charAt(0);
    }

    return true;
  }

  /*
     Sort the 'letters' array in either ascending or descending order.
     Textbook selection sort compares raw character values.
     Here, we convert both characters to UPPERCASE for comparison
     so 'a' and 'A' are treated as equal alphabetically.
  */
  public static void sortArray(int order) {

    for (int i = 0; i < SIZE - 1; i++) {   // FIXED: removed stray semicolon
      int targetIndex = i; // Index of MIN (ascending) or MAX (descending)

      for (int j = i + 1; j < SIZE; j++) {
        // Convert to uppercase for comparison only
        char a = Character.toUpperCase(letters[j]);
        char b = Character.toUpperCase(letters[targetIndex]);

        // Ascending: Find MIN
        if (order == 1 && a < b) targetIndex = j;
        // Descending: Find MAX
        if (order == 2 && a > b) targetIndex = j;
      }

      // Swap the actual characters (preserves original case)
      char temp = letters[i];
      letters[i] = letters[targetIndex];
      letters[targetIndex] = temp;
    }
  }

  // Print the original 'letters' array
  public static void printOriginal() {
    System.out.println("=============");
    System.out.print("Your array: ");
    
    for (int i = 0; i < SIZE; i++) {
      System.out.print(letters[i]);
      if (i < SIZE - 1) System.out.print(" ");
    }
    System.out.println();
  }

  // Print the sorted 'letters' array
  public static void printSorted(int order) {

    if (order == 1) {
      System.out.print("Ascending : ");
    } else {
      System.out.print("Decending : ");
    }

    for (int i = 0; i < SIZE; i++) {
      System.out.print(letters[i]);
      if (i < SIZE - 1) System.out.print(" ");
    }
    System.out.println("\n-----------------------------------------------------");
  }

  // Program execution starts here
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    while (true) {
      if (!getInput(input)) break;

      System.out.print("Ascending(1) or Descending(2) order? ");
      int choice = input.nextInt();
      input.nextLine();

      printOriginal();
      sortArray(choice);
      printSorted(choice);
    }
  }
}
