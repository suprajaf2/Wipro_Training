package day6;
public class SavingsAccoun implements Bank {
    private double balance;

    public SavingsAccoun(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds to withdraw $" + amount);
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
