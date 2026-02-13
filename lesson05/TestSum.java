public class TestSum {
    public static void main(String[] args) {
        // Initialize sum
        float sum = 0;

        // Add 0.01, 0.02, ..., 0.99, 1.00 to sum
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        // Display result (~50 w/float [32-bit] and ~49.5 w/double [64-bit])
        System.out.println("The sum is " + (int)sum);
    }
}