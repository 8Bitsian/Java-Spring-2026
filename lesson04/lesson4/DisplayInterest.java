package lesson4;

public class DisplayInterest {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        //ystem.out.println("Interest is $" + interest);
        //System.out.println("Interest is $" + (int)(interest * 100) / 100.0);
        System.out.printf("Interest is $%1.2f", interest);
    }
}
