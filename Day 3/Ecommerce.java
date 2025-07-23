package Day3;
interface PaymentMode {
    void pay(double amount);

}
class UpiPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCardPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class CashOnDelivery implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " will be collected on delivery.");
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        PaymentMode payment;   

       payment = new UpiPayment();
        payment.pay(1500.00);

        payment = new CreditCardPayment();
        payment.pay(3200.00);

        payment = new CashOnDelivery();
        payment.pay(2000.00);
        
        //UpiPayment u = new UpiPayment();
        //u.pay(1000);
        //CreditCardPayment c = new CreditCardPayment();
        //c.pay(12000);
        //CashOnDelivery d = new CashOnDelivery();
        //d.pay(5600);
    }
}

