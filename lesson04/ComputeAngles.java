// Import libraries
import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        // Create objects
        Scanner input = new Scanner(System.in);

        // Get input for point A
        System.out.println("Enter value for x1: ");
        double x1 = input.nextDouble();
        System.out.println("Enter value for y1: ");
        double y1 = input.nextDouble();

        // Get input for point B
        System.out.println("Enter value for x2: ");
        double x2 = input.nextDouble();
        System.out.println("Enter value for x2: ");
        double y2 = input.nextDouble();

        // Get input for point C
        System.out.println("Enter value for x3: ");
        double x3 = input.nextDouble();
        System.out.println("Enter value for y3: ");
        double y3 = input.nextDouble();

        // Compute three sides with distance formula:
        // \/ (x(2) - x(1)) ^ 2 + (y(2) - y(1)) ^ 2
        double sideAB = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
        double sideBC = Math.sqrt(Math.pow(x3 - x2, 2.0) + Math.pow(y3 - y2, 2.0));
        double sideCA = Math.sqrt(Math.pow(x1 - x3, 2.0) + Math.pow(y1 - y3, 2.0));

        // Output the sides
        System.out.println("The length of side AB is: " + sideAB);
        System.out.println("The length of side BC is: " + sideBC);
        System.out.println("The length of side CA is: " + sideCA);

        // Compute the three angles

        // A = acos(a*a - b*b - c*c) / -2 * b * c
        double angleA = Math.toDegrees(
                            Math.acos((Math.pow(sideAB, 2.0) - Math.pow(sideBC, 2.0) - Math.pow(sideCA, 2.0))
                            / (-2 * sideBC * sideCA)));

        // B = acos(b*b - a*a - c*c) / -2 * b * c
        double angleB = Math.toDegrees(
                Math.acos((Math.pow(sideBC, 2.0) - Math.pow(sideCA, 2.0) - Math.pow(sideAB, 2.0))
                        / (-2 * sideBC * sideCA)));

        // C = acos(c*c - a*a - b*b) / -2 * b * c
        double angleC = Math.toDegrees(
                Math.acos((Math.pow(sideCA, 2.0) - Math.pow(sideBC, 2.0) - Math.pow(sideAB, 2.0))
                        / (-2 * sideAB * sideBC)));

        // Output the angles
        System.out.println("The angle of (" + x1 + ", " + y1 + ") is: " + angleA);
        System.out.println("The angle of (" + x2 + ", " + y2 + ") is: " + angleB);
        System.out.println("The angle of (" + x3 + ", " + y3 + ") is: " + angleC);
    }
}
