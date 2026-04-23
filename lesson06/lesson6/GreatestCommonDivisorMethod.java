package lesson6;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));


    }

    private static int gcd(int n1, int n2) {
        int gcd = 1; //initial gcd is 1
        int k = 1; //possible gcd

        while(k <= n1 && k <= n2){
            if(n1 % k == 0 & n2 % k == 0)
                gcd = k;
            k++;
        }

        return gcd; //return gcd
    }
}
