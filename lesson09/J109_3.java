/*
  Imani Hollie 03/26/26
  Lab 9 Assignment: Write a test code to calculate the areas of circles with radii of 1, 10, and 100.

  Utilize the CircleWithPrivateDataFields class:
  - https://liveexample.pearsoncmg.com/html/CircleWithPrivateDataFields.html
*/

public class J109_3 {
    public static void main(String[] args) {
        // Declare CircleWithPrivateDataFields objects w/radii of 1, 10, and 100
        CircleWithPrivateDataFields circle1 = new CircleWithPrivateDataFields(1);
        CircleWithPrivateDataFields circle2 = new CircleWithPrivateDataFields(10);
        CircleWithPrivateDataFields circle3 = new CircleWithPrivateDataFields(100);

        // Show how many circles were created
        System.out.println("Number of Circle objects created: " +
                CircleWithPrivateDataFields.getNumberOfObjects());

        // Display getRadius() and getArea()
        System.out.println("\nOriginal Radii and Areas:");
        printCircleInfo("Circle 1", circle1);
        printCircleInfo("Circle 2", circle2);
        printCircleInfo("Circle 3", circle3);

        // Display setRadius()
        System.out.println("\nUpdating radii using setRadius()...");
        circle1.setRadius(2);
        circle2.setRadius(20);
        circle3.setRadius(200);

        // Display their updated radii and areas
        System.out.println("\nUpdated Radii and Areas:");
        printCircleInfo("Circle 1", circle1);
        printCircleInfo("Circle 2", circle2);
        printCircleInfo("Circle 3", circle3);
    }

    public static void printCircleInfo(String label, CircleWithPrivateDataFields circle) {
        System.out.printf("%s: Radius: %.3f -> Area: %.3f%n", label, circle.getRadius(), circle.getArea());
    }
}

class CircleWithPrivateDataFields {
    // The radius of the circle
    private double radius = 1;

    // The number of the objects created
    private static int numberOfObjects = 0;

    // Construct a circle with radius 1
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    // Construct a circle with a specified radius
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    // Return radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    // Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Return the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
