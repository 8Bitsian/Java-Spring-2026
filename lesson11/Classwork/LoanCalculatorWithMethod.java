import java.util.Scanner;

public class LoanCalculatorWithMethod {

  public static void main(String[] args) {
    LoanCalculatorWithMethod lc = new LoanCalculatorWithMethod();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter annual interest rate, e.g., 7.25%: ");
    double annualRate = input.nextDouble();

    System.out.print("Enter number of years, e.g., 5: ");
    int numberOfYears = input.nextInt();

    System.out.print("Enter loan amount, e.g., 12000.52: ");
    double loanAmount = input.nextDouble();

    lc.calculateLoan(annualRate, numberOfYears, loanAmount);
  }

  private void calculateLoan(double annualRate, int numberOfYears, double loanAmount) {
    double monthlyRate = annualRate / 1200;

    double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, numberOfYears * 12));

    double totalPayment = monthlyPayment * numberOfYears * 12;

    System.out.printf("The monthly payment is: %.2f%n", monthlyPayment);
    System.out.printf("The total payment is: %.2f%n", totalPayment);
  }
}
