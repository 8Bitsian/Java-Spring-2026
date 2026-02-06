// Import libraries
import java.util.Scanner;
public class GuessBirthday {
    public static void main(String[] args) {
        // Create objects
        Scanner input = new Scanner(System.in);

        // Create sets
        String set1 = """
             1  3  5  7
             9 11 13 15
            17 19 21 23
            25 27  7""";

        String set2 = """
             1  3  5  7
             9 11 13 15
            17 19 21 23
            25 27  7""";

        String set3 = """
             1  3  5  7
             9 11 13 15
            17 19 21 23
            25 27  7""";

        String set4 = """
             1  3  5  7
             9 11 13 15
            17 19 21 23
            25 27  7""";

        String set5 = """
             1  3  5  7
             9 11 13 15
            17 19 21 23
            25 27  7""";

        int day = 0;

        // Get input for birthday
        System.out.println("Is your birthday in Set 1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 (No) or 1 (Yes): ");
        int answer1 = input.nextInt();

        if (answer1 == 1)
            day += 1;

        System.out.println("Is your birthday in Set 2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 (No) or 1 (Yes): ");
        int answer2 = input.nextInt();

        if (answer2 == 1)
            day += 2;

        System.out.println("Is your birthday in Set 3?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 (No) or 1 (Yes): ");
        int answer3 = input.nextInt();

        if (answer3 == 1)
            day += 4;

        System.out.println("Is your birthday in Set 4?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 (No) or 1 (Yes): ");
        int answer4 = input.nextInt();

        if (answer4 == 1)
            day += 8;

        System.out.println("Is your birthday in Set 5?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 (No) or 1 (Yes): ");
        int answer5 = input.nextInt();

        if (answer5 == 1)
            day += 16;

        // Output potential birthday

    }
}
