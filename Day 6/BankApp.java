package day6;

public class BankApp {
    public static void main(String[] args) {
        Bank account = new SavingsAccoun(1000);

        account.displayAccountType();           // default override
        account.executeTransaction("deposit", 0);   // deposit
        account.executeTransaction("withdraw", 500);  // withdraw
        account.executeTransaction("withdraw", 500);  // invalid
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
