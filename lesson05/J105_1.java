/* Imani Hollie 01/30/2026
   5-Minute Challenge: Pint out the mathematical constant PI
   up to 15 decimal places

   Sample Output:
   Pi (2): 3.14
   Pi (3): 3.141
   ...
   Pi (14): 3.14159265358979
   Pi (15): 3.141592653589793
*/

// Alternative Interview Question for Lab 5

public class J105_1 {
  public static void main(String[] args) {
    final double PI = 3.141592653589793;  // Declare a constant PI w/value up to 15 decimal places
    
    //Section A For Loop from 0-15 to display PI
    for (int i = 0; i <= 15; ++i) {       // i = initial value; i < endValue; i++;
      System.out.printf("Pi (" + i + "): %." + i + "f\n", PI);
    }
  }
}
