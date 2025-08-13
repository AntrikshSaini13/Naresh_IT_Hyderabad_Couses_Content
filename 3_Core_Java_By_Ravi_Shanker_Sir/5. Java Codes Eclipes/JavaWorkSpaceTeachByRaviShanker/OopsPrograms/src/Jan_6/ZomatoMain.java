package Jan_6;

public class ZomatoMain {
	public static void main(String[] args) {
		
//		object creations is here
		
		ZomatoOrder order = new ZomatoOrder(101,"Piza",403.25);
		
		ZomatoCustomer cust1 = new ZomatoCustomer(180112,"Antriksh","NewMarket",order);
//		                                                                        this is object reference
//		printing statement here
		System.out.println(cust1);
	}

}
//Program: 2
//Create a class Order (Business Logic Class)
//Instance Variables: 
//   private int orderId;
//   private String itemName;
//   private double itemPrice;
//Create a parameterized constructor initialize the instance variable of the class.
//Override toString() from Object class to print Order class properties.
//
//Create a class Customer (Business Logic Class)
//Instance Variables: 
//   private int customerId;
//   private String customerName;
//   private String customerAddress;
//   private Order order; //HAS-A relation
//Create a parameterized constructor initialize the instance variable of the class.
//Override toString() from Object class to print Customer class properties.
//
//Create a class Zomato (Executable Logic Class) which contains main method to print Customer class properties using toString() method.
