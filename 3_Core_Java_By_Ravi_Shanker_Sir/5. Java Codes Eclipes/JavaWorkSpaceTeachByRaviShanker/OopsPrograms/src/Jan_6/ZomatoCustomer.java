package Jan_6;

public class ZomatoCustomer {
	//Instance Variables: 
	  private int customerId;
	  private String customerName;
	  private String customerAddress;
	  private ZomatoOrder ZomatoOrder; //HAS-A relation it means declare the class here as Data type and variable
	  
	public ZomatoCustomer(int customerId, String customerName, String customerAddress, Jan_6.ZomatoOrder zomatoOrder) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		ZomatoOrder = zomatoOrder;
	}
	
	@Override
	public String toString() {
		return "ZomatoCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", ZomatoOrder=" + ZomatoOrder + "]";
	}  
}

//Create a class Customer (Business Logic Class)
//Instance Variables: 
//   private int customerId;
//   private String customerName;
//   private String customerAddress;
//   private Order order; //HAS-A relation
//Create a parameterized constructor initialize the instance variable of the class.
//Override toString() from Object class to print Customer class properties.