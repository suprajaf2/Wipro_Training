package Day3;

public class Bankaccount {
private String AccountHolder;
private  double Balance;

public Bankaccount(String AccountHolder, double inintalBalance)
{
	this.AccountHolder=AccountHolder;
	this.Balance=inintalBalance;
}
public void deposit(double amount)
{
	Balance += amount;
    System.out.println( "you deposited " + amount + " New Balance: " + Balance);
}
public void withdraw(double amount)
{
	if(Balance<amount)
	{
		System.out.println("Insufficient balance");
	}
	else {
	Balance -= amount;
	System.out.println("You withdrawn " + amount + " Remaining Balance: " + Balance);
    }

}
public void display()
{
	System.out.println("Account Holder: " + AccountHolder);
    System.out.println("TotalBalance: " + Balance);
}
}
