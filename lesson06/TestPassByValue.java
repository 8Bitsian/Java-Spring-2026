// Imani Hollie 02/26/2026
import java.util.*;

public class TextPassByValue {
  public static void main(String[] args) { // Invocate main() method first
    int num1 = 5, num2 = 2;
    
    System.out.println("Before ");

    // Invoke the swap method to attempt 
    swap(num1, num2)
  }
  
  // Return the max between two numbers
  public static int max(int num1, int num2) { // Pass i (num1) and j (num2) into max() method
    int result = 0;
    
    if (num1 > num2) {
      result = num1;
    } else {
      result = num2;
    }
    
    return result;
  }
}
