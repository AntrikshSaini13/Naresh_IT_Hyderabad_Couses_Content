package Jan_25_2024_Test;

public class Customer{
	private String customerName;
	private int creditPoint;
	public Customer(String customerName, int creditPoint) {
		super();
		this.customerName = customerName;
		this.creditPoint = creditPoint;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", creditPoint=" + creditPoint + "]";
	}
	public int getCreditPoint() {
		return creditPoint;
	}
	public void setCreditPoint(int creditPoint) {
		this.creditPoint = creditPoint;
	}	
}