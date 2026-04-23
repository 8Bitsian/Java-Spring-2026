package lesson7;


import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        double[] myList = new double[5];
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();

        for (double value: myList)
            System.out.print(value + ", ");

        System.out.println();

    }
}
