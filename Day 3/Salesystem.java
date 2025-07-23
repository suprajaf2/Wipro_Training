package Day3;

public class Salesystem {
	private String productName;
	   private double price;
	   private int quantity;
	   // Constructor
	   public Salesystem(String productName, double price, int quantity) {
	       this.productName = productName;
	       this.price = price;
	       this.quantity = quantity;
	   }
	   // Calculate total price for the item
	   public double getTotalPrice() {
	       return price * quantity;
	   }
	   // Display item details
	   public void displayItem() {
		   System.out.println(productName + "\t" + price + "\t" + quantity + "\t" + getTotalPrice());
	   

	   }
	}
