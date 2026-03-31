/*
  Imani Hollie 03/26/26
  Lab 9 Assignment: Write a test code to calculate the areas of circles with radii of 1, 10, and 100.

  Utilize the CircleWithPrivateDataFields class:
  - https://liveexample.pearsoncmg.com/html/CircleWithPrivateDataFields.html
*/

public class J109_3 {
    public static void main(String[] args) {
        CircleWithPrivateDataFields circle1 = new CircleWithPrivateDataFields(1);
        CircleWithPrivateDataFields circle2 = new CircleWithPrivateDataFields(10);
        CircleWithPrivateDataFields circle3 = new CircleWithPrivateDataFields(100);

        System.out.println("Number of Circle objects created: " +
                CircleWithPrivateDataFields.getNumberOfObjects());

        printCircleInfo("Circle 1", circle1, 2);
        printCircleInfo("Circle 2", circle2, 20);
        printCircleInfo("Circle 3", circle3, 200);
    }

    public static void printCircleInfo(String label, CircleWithPrivateDataFields circle, double newRadius) {
        System.out.println("\n" + label + " - Original:");
        System.out.printf("Radius: %.3f -> Area: %.3f%n", circle.getRadius(), circle.getArea());

        circle.setRadius(newRadius);

        System.out.println(label + " - Updated:");
        System.out.printf("Radius: %.3f -> Area: %.3f%n", circle.getRadius(), circle.getArea());
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
