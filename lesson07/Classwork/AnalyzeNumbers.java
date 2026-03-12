public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Get user input
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        // Create an array
        double[] numbers = new double[n];

        // Calculate sum of elements in array
        double sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();;
            sum += numbers[i];
        }
        System.out.println();

        // Calculate the avg. of elements in array
        double average = sum / n;

        // Calculate numbers above the avg.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) // Count if number[i] > avg.
                count++;
        }

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Number of elements above average is " + count);
    }
}
