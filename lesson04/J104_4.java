/*
  Imani Hollie 01/22/2026
  Lesson 4 Lab: Write a program to calculate the distance between
  two points in 2D space represented by their (x, y) coordinates.
  The inputs should be (x1, y1) and (x2, y2).
  - Distance Formula: rad( (x2 - x1)^2 + (y2 - y1)^2 )

  Distance Calculation:
  - Display the result rounded up to two decimal places
  - Show only the integer part of the distance in parentheses

  Quadrant Determination:
  - Identify which quadrant (x2, y2) is in relative to (x1, y1) using the following cases:
    - Quadrant 1: (+x, +y)
    - Quadrant 2: (-x, +y)
    - Quadrant 3: (-x, -y)
    - Quadrant 4: (+x, -y)
    - If (x2, y2) lies on axis, indicate that

  Distance Categorization:
  - Short Distance: Less Than 5 Units
  - Medium Distance: 5 to 15 Units
  - Long Distance: More than 15 Units

  Sample Output:
  x1: 2
  y1: 3
  x2: 5
  y2: 7
  =======================================
  Distance between *** and *** : 123.45 (123)
  Integer part: (5)
  Category: Medium Distance
  Point (x2, y2) is in Quadrant ***
*/

// Import Libraries
import java.util.Scanner;                        // Allows use of Scanner objects

public class J104 {                            // Class "J104_4"
    public static void main (String[] args) {      // Method "main"
        Scanner input = new Scanner(System.in);      // Create Scanner object "input"

        // Get user input and validate for only digits
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        // Calculate distance
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
        double roundDistance = Math.round((distance * 100) / 100.0);
        int intDistance = (int) distance;

        // Determine distance category
        String category;
        if (distance < 5) {
            category = "Short Distance";
        } else if (distance <= 15) {
            category = "Medium Distance";
        } else {
            category = "Long Distance";
        }

        // Determine quadrant
        String quadrant;
        if (dx == 0 && dy == 0) {
            quadrant = String.format("at the same point as (%.2f, %.2f)", x1, y1);
        } else if (dx == 0) {
            quadrant = String.format("on the Y axis relative to (%.2f, %.2f)", x1, y1);
        } else if (dy == 0) {
            quadrant = String.format("on the X axis relative to (%.2f, %.2f)", x1, y1);
        } else if (dx > 0 && dy > 0) {
            quadrant = "Quadrant I";
        } else if (dx < 0 && dy > 0) {
            quadrant = "Quadrant II";
        } else if (dx < 0 && dy < 0) {
            quadrant = "Quadrant III";
        } else {
            quadrant = "Quadrant IV";
        }

        // Output results
        System.out.println("=======================================");
        System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f): %.2f (%d)\n",
                          x1, y1, x2, y2, roundDistance, intDistance);
        System.out.printf("Integer part: (%d)\n", intDistance);
        System.out.printf("Category: %s\n", category);
        System.out.printf("Point (%.2f, %.2f) is in %s\n", x2, y2, quadrant);

        input.close();                               // Close Scanner object "input"
    }
}                                                    // End of program
