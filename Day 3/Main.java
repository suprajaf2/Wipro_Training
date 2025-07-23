package Day3;

public class Main {
public static void main(String[] args)
{
	Bankaccount b = new Bankaccount("supraja", 500);
	b.deposit(4000);
	b.withdraw(1000);
	b.display();
}
}
