public class PrimeNumbers {
    public static void main(String[] args) {
        final int NUM_PRIMES = 50; // Number of primes to display
        final int NUM_PRIMES_LINES = 10; // Display 10 per line
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are:\n");

        // Find prime numbers
        while (count < NUM_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true;

            // Test if number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++; // Increase the count

                if (count % NUM_PRIMES_LINES == 0) {
                    // Print the number and advance to the new line
                    System.out.println(number);
                } else
                    System.out.println(number + " ");
            }

            number++;
        }
    }
}
