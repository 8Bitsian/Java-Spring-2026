import java.util.Scanner;

public class Loan {
  private double annualRate;
  private int numberOfYears;
  private double loanAmount;
  private LocalDate loanDate;

  // Constructors (In IntelliJ you can right-click > Generate > Constructor)
  public Loan() {}
  
  // You can Crtl + click to add multiple parameters in constructor
  public Loan(double annualRate, int numberOfYears, double loanAmount) {
    this.annualRate = annualRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
  }
}

public class LoanCalculatorWithObject {
  public staic void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter annual interest rate, e.g, 7.25% : ");
    double annualRate = input.nextDouble();
    
    double monthlyRate = annualRate / 1200;

    System.out.print("Enter number of years, e.g, 5 : ");
    int numberOfYears = input.nextInt();

    System.out.print("Enter loan amount, e.g, 12000.52 : ");
    double loanAmount = input.nextDouble();

    calculateLoan(
  }
}
