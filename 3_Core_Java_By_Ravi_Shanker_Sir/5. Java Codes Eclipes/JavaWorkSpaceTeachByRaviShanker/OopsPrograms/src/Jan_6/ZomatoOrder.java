package Jan_6;

public class ZomatoOrder {
	//Instance Variables: 
	  private int orderId;
	  private String itemName;
	  private double itemPrice;
	  
	  
	public ZomatoOrder(int orderId, String itemName, double itemPrice) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	
	@Override
	public String toString() {
		return "ZomatoOrder [orderId=" + orderId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	  
	  
}
//Create a class Order (Business Logic Class)
//Instance Variables: 
//   private int orderId;
//   private String itemName;
//   private double itemPrice;
//Create a parameterized constructor initialize the instance variable of the class.
//Override toString() from Object class to print Order class properties.