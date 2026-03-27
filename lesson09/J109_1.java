/* Imani Hollie 03/26/2026
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

public class J109_1 {  // J109_1 class
  public static void main(String[] args) {  // Program execution starts here
    // Declare objects
    Scanner input = new Scanner(System.in); // Declare a Scanner object "input'
    Person p = new Person();                // Declare a Person object "p"

    // Get user input
    String name = p.getName(input);         // Declare String "name" and call Person object getName() method
    String phone = p.getPhone(input);       // Declare String "name" and call Person object getPhone() method

    // Output
    System.out.println("Your name: " + name);
    System.out.println("Last 4-digit phone number: " + phone);
  }
}

public class Person {  // Person class
  public String getName(Scanner input) {
    System.out.print("Name? ");
    return input.nextLine();
  }

  public String getPhone(Scanner input) {
    System.out.print("Last 4-digit phone number? ");
    return input.nextLine();
  }
}
