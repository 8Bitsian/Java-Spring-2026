public class TestBreak {
    public static void main(String[] args) {
        int sum = 0, num = 0;

        while (num < 20) {
            num++;
            sum += num;
            if (sum >= 100)
                break;
        }

        System.out.println("The number is " + num); // The number of iterations
        System.out.println("The sum is " + sum); // The sum of what was iterated
    }
}
