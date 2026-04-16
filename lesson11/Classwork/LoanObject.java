import java.time.LocalDate;

public class LoanObject {
  private double annualRate;
  private int numberOfYears;
  private double loanAmount;
  private LocalDate loanDate;

  // No‑arg constructor
  public Loan() {
    loanDate = LocalDate.now();
  }

  // Constructor with parameters
  public Loan(double annualRate, int numberOfYears, double loanAmount) {
    this.annualRate = annualRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    this.loanDate = LocalDate.now();
  }

  // Getters and Setters
  public double getAnnualRate() {
    return annualRate;
  }

  public void setAnnualRate(double annualRate) {
    this.annualRate = annualRate;
  }

  public int getNumberOfYears() {
    return numberOfYears;
  }

  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  public double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public LocalDate getLoanDate() {
    return loanDate;
  }

  public double getMonthlyPayment() {
    double monthlyRate = annualRate / 1200;

    return loanAmount * monthlyRate /
        (1 - 1 / Math.pow(1 + monthlyRate, numberOfYears * 12));
  }

  public double getTotalPayment() {
    return getMonthlyPayment() * numberOfYears * 12;
  }
}
