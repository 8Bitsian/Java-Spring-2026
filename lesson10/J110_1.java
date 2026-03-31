/*
    Imani Hollie 03/31/2026
    5 Minute Challenge: Calculate the area of a circle with radii of 1, 10, and 100.
    Write a code that performs the following steps:
    - Create a class called "Circle" with appropriate constructors, getters, and setters
    - Use the constructors, getters, and setters in your test code to compute the area of circles.
*/

public class J110_1 {
    public static void main(String[] args) {

        // Create Circle objects using the constructor
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(100);

        // Print results using getters
        System.out.printf("Radius: %.2f | Area: %.5f%n", c1.getRadius(), c1.getArea());

        // Demonstrate setter by changing c1's radius from 1 to 10;
        c1.setRadius(10);

        // Print results using getters
        System.out.printf("Radius: %.2f | Area: %.5f%n", c1.getRadius(), c1.getArea());
        System.out.printf("Radius: %.2f | Area: %.5f%n", c2.getRadius(), c2.getArea());
    }
}

class Circle {
    private double radius;

    // Constructor
    public Circle(double r) {
        radius = r;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double r) {
        radius = r;
    }

    // Compute area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
