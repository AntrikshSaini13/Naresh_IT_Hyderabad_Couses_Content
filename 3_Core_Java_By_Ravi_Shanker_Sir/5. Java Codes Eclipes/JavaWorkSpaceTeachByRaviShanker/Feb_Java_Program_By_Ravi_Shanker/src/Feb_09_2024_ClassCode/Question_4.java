package Feb_09_2024_ClassCode;

class Customer
{
	private int customerId;
	private String customerName;
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	//Overriding equals() method for content comparison
	@Override         // (type   reference)
	public boolean equals(Object obj) //obj = c2 (2000x)
	{
		//First Object content
		int id1 = this.customerId;
		String name1 = this.customerName;
		
		//2nd object data
		Customer c2 = (Customer) obj;//Large Data put inside the small Container
		int id2 = c2.customerId;
		String name2 = c2.customerName;
		
		if(id1==id2  && name1.equals(name2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}		
}
public class Question_4
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(1,"Scott"); //1000x
		Customer c2 = new Customer(1,"Scott"); //2000x
		System.out.println(c1.equals(c2));

	}

}