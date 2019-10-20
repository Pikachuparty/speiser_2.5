package speiser_2;
import java.util.Scanner;
public class SavingsAccount {

    private static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount () {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount (double balance) {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterestRate () {
        double monthlyInterest;
        System.out.printf("Current savings balance: %.02f \n", savingsBalance);
        monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        System.out.printf("Updated savings balance: %.02f \n", savingsBalance);

    }

    public double fetchBalance() {

        return savingsBalance;
    }

    public static void modifyInterestRate (double updatedInterestRate) {

        annualInterestRate = updatedInterestRate;
    }

}
class  Application {

    public static void main (String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.modifyInterestRate(.04);
        saver1.calculateMonthlyInterestRate();
        saver2.modifyInterestRate(.04);
        saver2.calculateMonthlyInterestRate();
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterestRate();
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterestRate();
    }
}
