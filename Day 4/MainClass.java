package app;

import bank.Creditcardpayment;
import bank.UPIpayment;
import billing.BillGenerator;

public class MainClass {
    public static void main(String[] args) {
        // Abstract Class Demo
        Creditcardpayment ccp = new Creditcardpayment(5000);
        ccp.makePayment();

        UPIpayment upi = new UPIpayment(1500);
        upi.makePayment();

        // Interface + Lambda Demo
        BillGenerator.displayHeader();  // static method from interface

        BillGenerator bill = (amount) -> {
            System.out.println("Amount: ₹" + amount);
            System.out.println("Thank you for your payment!");
        };

        bill.showBillFormat();  // default method
        bill.generate(6500);    // lambda expression used
    }
}

