package day6;

interface Service {
    void placeOrder();

    default void printInvoice() {
        System.out.println("Generic Invoice: Order processed.");
    }
}

interface OnlineOrder extends Service {
	void placeOrder();
    @Override
    default void printInvoice() {
        System.out.println("Online Invoice: Payment received via UPI.");
    }
}

interface OfflineOrder extends Service {
	void placeOrder();
    @Override
    default void printInvoice() {
        System.out.println("Offline Invoice: Pay at the counter.");
    }
}
