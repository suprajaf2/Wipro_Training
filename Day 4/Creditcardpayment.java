package bank;
	public class Creditcardpayment extends Payment {
	    public Creditcardpayment(double amount) {
	        super(amount);
	    }

	    @Override
	    public void makePayment() {
	        System.out.println("Processing Credit Card Payment...");
	        printReceipt();
	    }
	}

