/*
  Imani Hollie 03/26/26
  Lab 9 Assignment: Write a test code to calculate the areas of circles with radii of 1, 10, and 100.
  Utilize the CircleWithPrivateDataFields class: https://liveexample.pearsoncmg.com/html/CircleWithPrivateDataFields.html
*/

import java.util.Scanner;

public class J109_3 {
  public static void main(String[] args) {
    // Declare objects
    Scanner input = new Scanner(System.in);
    CricleWithPrivateDataFields circle = new CricleWithPrivateDataFields();
  }
}

public class CircleWithPrivateDataFields {
  // The radius of the circle
  private double radius = 1;

  // The number of the objects created
  private static int numberOfObjects = 0;

  // Construct a circle with radius 1
  public CircleWithPrivateDataFeilds() {
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
