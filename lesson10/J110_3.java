/*
    Imani Hollie 03/31/2026
    Lab 10 Assignment: Write a code to estimate Euler's number using the formula below:
    - e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/i! = 2.71828182845...
    Write a code that performs the following steps:
    - Create an "Euler" class to calculate the value of e for i = 1, 2, 5, 10, 50, 100, 200
    - Refer to https://www.mathisfun.com/numbers/e-eulers-number.html for more information
    - The input should be the maximum of "i" used in the summation
*/

import java.util.Scanner;

public class J110_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Maximum: ");
        int max = input.nextInt();
        System.out.println();

        Euler eCalc = new Euler();

        int[] values = {1, 2, 5, 10, 50, 100, 200};

        for (int i : values) {
            if (i <= max) {
                double estimate = eCalc.computeE(i);
                System.out.printf("Approximation of e for i = %d: %.12f%n", i, estimate);
            }
        }
    }
}

class Euler {
    public double computeE(int max) {
        double sum = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= max; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
        }

        return sum;
    }
}
