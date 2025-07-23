package bank;

public class UPIpayment extends Payment {
    public UPIpayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing UPI Payment...");
        printReceipt();
    }
}
