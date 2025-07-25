package day6;

public class OrderSystem {
    public static void main(String[] args) {
        // Use OnlineOrder behavior
        Service order = new Orders(); // You can cast as OnlineOrder or OfflineOrder too

        System.out.println("--- ORDER ---");
        order.placeOrder();
        order.printInvoice();

        System.out.println("");
    }
}
