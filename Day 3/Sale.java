package Day3;
public class Sale {
		   public static void main(String[] args) {
		       Salesystem[] items = {
		           new Salesystem("Laptop",   50000,  1),
		           new Salesystem("Mouse",    500,    2),
		           new Salesystem("Keyboard", 1000,   1)
		       };
		       double grandTotal = 0;
		       System.out.println("Product\tPrice\tQty\tTotal");
		       System.out.println("--------------------------------------");
		       for (Salesystem item : items) {
		           item.displayItem();
		           grandTotal += item.getTotalPrice();
		       }
		       System.out.println("--------------------------------------");
		       System.out.println("Grand Total: " + grandTotal);
		   }
		}
