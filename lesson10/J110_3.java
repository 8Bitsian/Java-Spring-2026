/*
    Imani Hollie 03/31/2026
    Lab 10 Assignment: Write a code to estimate Euler's number using the formula below:
    - e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/i! = 2.71828182845...
    Write a code that performs the following steps:
    - Create an "Euler" class to calculate the value of e for i = 1, 2, 5, 10, 50, 100, 200
    - Refer to https://www.mathisfun.com/numbers/e-eulers-number.html for more information
    - The input should be the maximum of i used in the summation
*/

public class J110_3 {
    static void main() {
        int[] values = {1, 2, 5, 10, 50, 100, 200};

        for (int i : values) {
            Euler eCalc = new Euler(i);
            double estimate = eCalc.calculateE();
            System.out.println("i = " + i + " → e ≈ " + estimate);
        }
    }
}

class Euler {
    private int max;

    public Euler(int max) { this.max = max; }

    public double calculateE() {
        double sum = 0;

        for (int i = 1; i <= max; i++)
            sum += 1.0 / factorial(i);

        return sum;
    }

    private long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }
}
