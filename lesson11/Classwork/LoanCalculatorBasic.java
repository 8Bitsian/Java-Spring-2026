import java.util.Scanner;

public class LoanCalculatorBasic {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter annual interest rate, e.g., 7.25%: ");
    double annualRate = input.nextDouble();

    double monthlyRate = annualRate / 1200;

    System.out.print("Enter number of years, e.g., 5: ");
    int numberOfYears = input.nextInt();

    System.out.print("Enter loan amount, e.g., 12000.52: ");
    double loanAmount = input.nextDouble();

    double monthlyPayment = loanAmount * monthlyRate /
        (1 - 1 / Math.pow(1 + monthlyRate, numberOfYears * 12));

    double totalPayment = monthlyPayment * numberOfYears * 12;

    System.out.println("The monthly payment is: " + monthlyPayment);
    System.out.println("The total payment is: " + totalPayment);
  }
}

