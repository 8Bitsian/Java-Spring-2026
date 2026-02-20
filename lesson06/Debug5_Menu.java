import java.util.Scanner;

public class MenuDebug {
  public static void main(String[] args) {
    /*
    Scanner input = new Scanner(System.in);
    int choice = 1;
    while (choice != 0) {
      System.out.println("0. EXIT");
      System.out.println("1. Hello");
      System.out.println("2. Goodbye");
      choice = input.nextInt();

      switch (choice) {
        case 0: System.out.println("Exiting..."); // No break statements
        case 1: System.out.println("Hello!");
        case 2: System.out.println("Goodbye!");
        default: System.out.println("Invalid Input...");
      }
    }
    */

    Scanner input = new Scanner(System.in);
    int choice = 1;
    while (choice != 0) {
      System.out.println("0. EXIT");
      System.out.println("1. Hello");
      System.out.println("2. Goodbye");
      choice = input.nextInt();

      switch (choice) {
        case 0: System.out.println("Exiting..."); break;
        case 1: System.out.println("Hello!"); break;
        case 2: System.out.println("Goodbye!"); break;
        default: System.out.println("Invalid Input...");
      }
    }

  }
}
