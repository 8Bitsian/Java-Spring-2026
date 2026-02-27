import java.util.Scanner;

public class PrintCalendar {
  /* Get user input (year and monthNumber)
       Convert the monthNumber to Month(String)
     Print the Calendar
     - How many day are in the month?
         - Check month/year against switch statement
            switch (month)
            case: 1,3,5,7,8,10,12 are 31 days
            case: 4, 6, 9, 11 are 30 days
            case: 2
              if year = leapyear then 28
              else 29
      - What day of the week does the month start?
     
      Methods
      main
      readInput -> printMonth
      printMonthTitle -> getMonthName
      printMonthBody -> getStartDay -> getTotalNumOfDays -> getNumOfDaysInMonth -> isLeapYear
  */

  // Main Method
  
  // Create global variables within the class and outside of the methods
  static int y = 9;
  
  public static void main(String[] args) {
    // Static methods can only read static variables
    System.out.println("y = " + y);

    // Create local variables inside of the methods
    int x = 1;
    System.out.println("Before the call: " + x);
    increment(x);
    System.out.println("After the call: " + x);
  }

  // printMonthTitle
}
