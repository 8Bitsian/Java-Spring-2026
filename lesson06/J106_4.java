/* Imani Hollie 01/30/2026
   Lesson 6 Lab: Palindrome
   Write a program that checks if user input is a palindrome.
   Create a method for each task below:
   - Remove all punctuation marks in the input string
   - Remove all blank spaces in the string
   - Reverse the order of the string
   - Compare the reversed string with the original string
     * Do not use any internal method such as equals() for d
   - Print out the decision
*/

import java.util.Scanner;

public class J106_4 {
  public static void main(String[] args) {
    // Create Scanner object "input"
    Scanner input = new Scanner(System.in);
    // Get user input
    System.out.print("Enter a string: ");
    String originalString = input.nextLine();

    // Call removeMarks() to remove any puncutation marks
    String noMarks = removeMarks(originalString);
    // Call removeSpaces() to remove any tabs and/or spaces
    String noSpaces = removeMarks(noMarks);
    // Call reverseOrder() to reverse the order of characters
    String reversed = reverseOrder(noSpaces);

    // Call compareString() to compare the original String and new String
    compareStrings(originalString, reversed);
  }

  public static void removeMarks(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isLetterOrDigit(c)) {
        result += c;
      }
    }
    return result;
  }
  
  public static void removeSpaces(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c != ' ' && c != '\t') {
        result += c;
      }
    }
    return result;
  }
  
  public static void reverseOrder(String s) {
    String reversed = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      reversed += s.charAt(i);
    }
    return reversed;
  }
  
  public static void compareStrings(String s1, String s2) {
    if (s1.length() != s2.length()) {
      System.out.println("Is NOT a palindrome.");
      return;
    }
    
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        System.out.println("Is NOT a palindrome.");
        return;
      }
    }

    System.out.println("Is a palindrome.");
  }
}
