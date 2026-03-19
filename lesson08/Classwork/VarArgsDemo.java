public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(5, 1, 2, 3);
        printMax(new double[]{1, 2, 3});
        printMax(1, new double[]{1, 2, 3});
    }

    public static void printMax(double ... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed...");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);
    }

    // Overridden method to pass in and index parameters
    public static void printMax(int index, double ... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed...");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);
    }
}
