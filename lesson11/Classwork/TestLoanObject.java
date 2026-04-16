import java.util.Scanner;

public class TestLoanObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, e.g., 7.25%: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter number of years, e.g., 5: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, e.g., 12000.52: ");
        double loanAmount = input.nextDouble();

        LoanObject loan = new LoanObject(annualRate, numberOfYears, loanAmount);

        System.out.printf("The date the loan was made is: %s%n", loan.getLoanDate());
        System.out.printf("The monthly payment is: %.2f%n", loan.getMonthlyPayment());
        System.out.printf("The total payment is: %.2f%n", loan.getTotalPayment());
    }
}
