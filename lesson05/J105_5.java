/* Imani Hollie 01/30/2026
   Lesson 5 Lab: Write a code to check whether a user input is a palindrome
   - Analyze/trace the sample program with sample data "aabaa" and "aabbaa"
   - Keep running your code until a user enters 0 as a sentinel value
   - Apply your own algorithm and test it w/"Was it a cat I saw?" to ensure it's working
   
   Sample Program:
   String s = input.nextLine();
   int low = 0;
   int hight = s.length() - 1;
   boolean isPalindrome = true;
   while (low < high) {
     if (s.charAt(low) != s.charAt(high)) {
       isPalindrome = false;
       break;
     }
     low++;
     high--;
   }

   Sample Output:
   Palindrome? my gym // taco cat, Step on no pets, Was it a cat i saw?
   Yes
   my gym : my gym    // Was it a cat I saw : was It a cat I saW
   =======================================================
   Palindrome? Dog
   No
   =======================================================
   Palindrome? 0
   Thank you.
   =======================================================
*/

import java.util.Scanner;

public class J105_5 {                         // Define class 'J105_5'
  public static void main(String[] args) {    // Define method 'main'
    Scanner input = new Scanner(System.in);   // Define Scanner object 'input'

    while (true) {
      // Get user input
      System.out.print("Palindrome? ");
      String s = input.nextLine();

      if (s.equals("0")) {
        System.out.println("Thank you.");
        System.out.println("=======================================================");
        break;
      }

      // Format by removing punctuation, keeping spaces, and converting to lowercase
      String cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
      String noSpaces = cleaned.replaceAll(" ", "");

      boolean isPalindrome = true;
      int low = 0;
      int high = noSpaces.length() - 1;

      while (low < high) {
        if (noSpaces.charAt(low) != noSpaces.charAt(high)) {
          isPalindrome = false;
          break;
        }
        low++;
        high--;
      }

      if (isPalindrome) {
        System.out.println("Yes");
        System.out.println(s.replaceAll("[^a-zA-Z ]", "") + " : " + cleaned);
      } else {
        System.out.println("No");
      }
      
      System.out.println("=======================================================");

      input.close();
    }
  }
}
