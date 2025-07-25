package day6;

class Orders implements OnlineOrder, OfflineOrder {

    @Override
    public void placeOrder() {
        System.out.println("Placing order from Orders class for both online and offline...");
    }

    @Override
    public void printInvoice() {
        System.out.println("Custom invoice for both online and offline orders:");
        OnlineOrder.super.printInvoice();
        OfflineOrder.super.printInvoice();
    }
}
