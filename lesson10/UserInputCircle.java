/*
    Imani Hollie 03/31/2026
    5 Minute Challenge: Calculate the area of a circle with radii of 1, 10, and 100.
    Write a code that performs the following steps:
    - Create a class called "Circle" with appropriate constructors, getters, and setters
    - Use the constructors, getters, and setters in your test code to compute the area of circles.

*/

import java.util.Scanner;

public class UserInputCircle {
    public static void main(String[] args) {
        while (true) { // Loop until user enters X
            // Call userInput() to get radius or exit signal (X)
            double radius = userInput();

            // Check if userInput() returned -1 (X)
            if (radius == -1) {
                System.out.println("Goodbye!");
                break;
            }

            // Declare Circle object "userCircle" w/the constructor
            Circle userCircle =  new Circle(radius);

            // Print output using the getters getRadius() and getArea()
            System.out.printf("Radius: %.2f | Area %.5f%n", userCircle.getRadius(), userCircle.getArea());
        }
    }

    public static double userInput() {
        // Declare Scanner object "input"
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter radius: ");
        String text = input.next();

        // If user inputs 'X' return -1 to exit program
        if (text.equalsIgnoreCase("X")) { return -1; }

        // Convert text to a number
        return Double.parseDouble(text);
    }
}

class Circle {
    private final double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
