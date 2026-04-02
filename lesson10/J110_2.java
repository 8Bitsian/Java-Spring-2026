/*
    Imani Hollie 03/31/2026
    Lab 10 Assignment: Update the BMI Calculator to allow selection of the unit system (kilogram/meter or pound/inch)
    Source: https://liveexample.pearsoncmg.com/html/BMI.html
    Write a code that performs the following steps:
    - Use the proper conversion factor
    - Add proper comments to the code. Use "//*" to indicate your modifications
*/

import java.util.Scanner;

public class J110_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Get user input for which unit system or X
            int choice = getMenuInput(input);
            if (choice == -1) break;

            // Get user input for name and age or X
            String[] userData = getNameAndAge(input);
            if (userData == null) break;

            // Get user input for weight and height or X
            double[] values = getWeightAndHeight(choice, input);
            if (values == null) break;

            // Create BMI object using the collected data
            BMI bmi = new BMI(userData[0], Integer.parseInt(userData[1]), values[0], values[1]);

            // Print the BMI results
            printOutput(bmi);

            // Ask user if they want to continue
            System.out.println("\nPress [ENTER] to continue or type X to quit.");
            String exit = input.nextLine();
            if (exit.equalsIgnoreCase("X")) break;
        }
        System.out.println("\nExiting Program...");
    }

    public static int getMenuInput(Scanner input) {
        while (true) {
            System.out.println("\nSelect Unit System:");
            System.out.println("1. Imperial (lbs/in)");
            System.out.println("2. Metric (kg/m)");
            System.out.println("X. Exit Program");
            System.out.println("--------------------");
            System.out.print("Enter Choice: ");

            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("X")) return -1; // Exit

            if (userInput.equals("1") || userInput.equals("2"))
                return Integer.parseInt(userInput); // Valid choice

            System.out.println("ERROR: Invalid Input - Enter 1, 2, or X to exit.");
        }
    }

    public static String[] getNameAndAge(Scanner input) {
        System.out.print("\nEnter Name: ");
        String name = input.nextLine();
        if (name.equalsIgnoreCase("X")) return null;

        while (true) {
            System.out.print(" Enter Age: ");
            String ageInput = input.nextLine();

            if (ageInput.equalsIgnoreCase("X")) return null;
            if (ageInput.matches("\\d+")) return new String[]{name, ageInput};

            System.out.println("ERROR: Invalid Input - Digits only (0-9).");
        }
    }

    public static double[] getWeightAndHeight(int choice, Scanner input) {
        if (choice == 1)
            return getImperialValues(input);   //*
        else
            return getMetricValues(input);     //*
    }

    public static double[] getImperialValues(Scanner input) {

        while (true) {
            System.out.print("Enter Weight (lbs): ");
            String w = input.nextLine();
            if (w.equalsIgnoreCase("X")) return null;

            System.out.print(" Enter Height (in): ");
            String h = input.nextLine();
            if (h.equalsIgnoreCase("X")) return null;

            if (w.matches("[0-9.]+") && h.matches("[0-9.]+")) {
                double weight = Double.parseDouble(w);
                double height = Double.parseDouble(h);
                return new double[]{weight, height};
            }

            System.out.println("ERROR: Invalid Input - Digits only (0-9).");
        }
    }

    public static double[] getMetricValues(Scanner input) {

        while (true) {
            System.out.print("Enter Weight (kg): ");
            String w = input.nextLine();
            if (w.equalsIgnoreCase("X")) return null;

            System.out.print(" Enter Height (m): ");
            String h = input.nextLine();
            if (h.equalsIgnoreCase("X")) return null;

            if (w.matches("[0-9.]+") && h.matches("[0-9.]+")) {
                double kg = Double.parseDouble(w);
                double m = Double.parseDouble(h);

                double weight = kg / BMI.KILOGRAMS_PER_POUND;
                double height = m / BMI.METERS_PER_INCH;

                return new double[]{weight, height};
            }

            System.out.println("ERROR: Invalid Input - Digits only (0-9).");
        }
    }

    public static void printOutput(BMI bmi) {
        System.out.println("\n----- BMI Report -----");
        System.out.println("        Name: " + bmi.getName());
        System.out.println("         Age: " + bmi.getAge());
        System.out.println("Weight (lbs): " + bmi.getWeight());
        System.out.println(" Height (in): " + bmi.getHeight());
        System.out.println("         BMI: " + bmi.getBMI());
        System.out.println("      Status: " + bmi.getStatus());
    }
}

class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
