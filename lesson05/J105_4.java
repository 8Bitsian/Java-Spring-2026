/* Imani Hollie 01/30/2026
   Lesson 5 Lab: Write a program that calculates the number of months it will take for
   a principal amount of $100,000 to become half the amount ($50,000), assuming you
   spend 5% of what you have every month
   
   Sample Output:
   Princial ($)? 100000
   After 1 month: You have $*** = $100,000 (1-5%)
   After 2 months: You have $*** = $*** (1-5%)
   ...
   After n months: You have $*** = $*** (1-5%)
   =============================================
   Your principal will be halved in N months
*/

public class J105_4 {                         // Define class 'J105_4'
  public static void main(String[] args) {    // Define method 'main'
    Scanner input = new Scanner(System.in);   // Create Scanner object for input
    System.out.print("Principal ($)? ");      // Prompt the user for input
    double principal = input.nextDouble();    // Read a double from user input
    
    double currentAmount = principal;         // Declare variables
    
    int month = 0;                            // (count = initial value;)
    while (currentAmount > principal / 2) {
      month++;
      double spent = currentAmount * 0.05;
      currentAmount -= spent;
      System.out.printf("After %d month%s: You have $%,.2f = $%,.2f (1-5%%)%n",
                         month, (month > 1 ? "s" : ""), currentAmount, spent);
    }

    System.out.println("=============================================");
    System.out.printf("Your principal will be halved in %d month%s%n",
                       month, (month > 1 ? "s" : ""));
  }
}
