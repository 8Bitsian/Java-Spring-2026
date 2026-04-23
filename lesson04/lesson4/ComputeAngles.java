package lesson4;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        //Create and instance of Scanner for console input
        Scanner input = new Scanner(System.in);

        //Prompt user to enter points
        System.out.print("Enter value for x1 : ");
        double x1 = input.nextDouble();

        System.out.print("Enter value for y1 : ");
        double y1 = input.nextDouble();

        System.out.print("Enter value for x2 : ");
        double x2 = input.nextDouble();

        System.out.print("Enter value for y2 : ");
        double y2 = input.nextDouble();

        System.out.print("Enter value for x3 : ");
        double x3 = input.nextDouble();

        System.out.print("Enter value for y3 : ");
        double y3 = input.nextDouble();

        //Compute the three sides using the distance formula
        /*
                  _____________________________________
                \/ (x(2) - x(1)) ^2 + (y(2) - y(1)) ^2
         */
        double sideAB = Math.sqrt(Math.pow((x2- x1), 2.0) + Math.pow((y2- y1), 2.0));

        double sideBC = Math.sqrt(Math.pow((x3- x2), 2.0) + Math.pow((y3- y2), 2.0));

        double sideCA = Math.sqrt(Math.pow((x1- x3), 2.0) + Math.pow((y1- y3), 2.0));

        // Output the sides
        System.out.println("The length of side AB is : " + sideAB);
        System.out.println("The length of side BC is : " + sideBC);
        System.out.println("The length of side CA is : " + sideCA);

        //Compute the three angles
        /*
              acos(a*a - b*b - c*c)
         A = ------------------------
              -2 * b * c
         */
        double angleA = Math.toDegrees(
                Math.acos((Math.pow(sideAB, 2.0) - Math.pow(sideBC, 2.0) - Math.pow(sideCA, 2.0))
                        / (-2 * sideBC * sideCA)));

        /*
              acos(b*b - a*a- c*c)
         B = ------------------------
              -2 * a * c
         */
        double angleB =Math.toDegrees(
                Math.acos((Math.pow(sideBC, 2.0) - Math.pow(sideAB, 2.0) - Math.pow(sideCA, 2.0))
                        / (-2 * sideAB * sideCA)));

        /*
              acos(c*c - b*b - a*a )
         C = ------------------------
              -2 * a * b
         */
        double angleC = Math.toDegrees(
                Math.acos((Math.pow(sideCA, 2.0) - Math.pow(sideBC, 2.0) - Math.pow(sideAB, 2.0))
                        / (-2 * sideAB * sideBC)));

        //Display the results
        System.out.println("Angle A is : " + Math.round(angleA * 100) / 100.0);
        System.out.println("Angle B is : " + Math.round(angleB * 100) / 100.0);
        System.out.println("Angel C is : " + Math.round(angleC * 100) / 100.0);


    }
}
