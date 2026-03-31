/* 
   Imani Hollie 03/26/2026
   5-Minute Challenge: Write a program that takes user input for a name and the last 4 digits
   of a phone number from the keyboard, then prints them to the console.
   Create a class "Person" inside your text code.
   
   Sample Output:
   Name? Jane Doe
   Last 4-digit phone number? ****
   Your name: Jane Doe
   Last 4-digit phone number: ****
*/

import java.util.Scanner;

public class J109_1 {
   public static void main(String[] args) {
      // Declare objects
      Scanner input = new Scanner(System.in);
      Person p = new Person();

      // Get user input
      String name = p.getName(input);
      String phone = p.getPhone(input);

      // Output
      System.out.println("Your name: " + name);
      System.out.println("Last 4-digit phone number: " + phone);
   }
}

public class Person {
   public String getName(Scanner input) {
      String name;
      while (true) {
         System.out.print("Name? ");
         name = input.nextLine().trim();

         if (name.matches("[a-zA-Z- ]+")) {
            return name;
         } else {
            System.out.println("ERROR: Invalid Input - Name cannot be blank.");
         }
      }
   }

   public String getPhone(Scanner input) {
      String phone;
      while (true) {
         System.out.print("Last 4-digit phone number? ");
         phone = input.nextLine().trim();

         if (phone.matches("\\d{4}")) {
            return phone;
         } else {
            System.out.println("ERROR: Invalid Input - Phone must be exactly 4 digits (0-9).");
         }
      }
   }
}

