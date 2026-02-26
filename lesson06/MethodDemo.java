// Imani Hollie 02/26/2026
import java.util.*;

public class MethodDemo {
  public static void main(String[] args) {
    System.out.println("The sum of values from 1 to 10 is " + sum(1, 10));
    System.out.println("The sum of values from 20 to 37 is " + sum(20, 37));
    System.out.println("The sum of values from 35 to 49 is " + sum(35, 49));
  }
  
  // Return the sum for a range of values
  public static int sum(int number1, int number2) {
    int result = 0;
    for (int i = number1; i <= number2; i++)
      result += i;
    return result;
  }
}
