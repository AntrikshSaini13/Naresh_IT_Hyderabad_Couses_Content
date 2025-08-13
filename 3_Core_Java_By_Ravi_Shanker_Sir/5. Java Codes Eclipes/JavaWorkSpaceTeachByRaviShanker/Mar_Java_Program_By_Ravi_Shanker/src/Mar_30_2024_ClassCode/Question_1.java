package Mar_30_2024_ClassCode;

class Customer{
	double amount = 200000;
	double withDraw ;
	public Customer(double withDraw) {
		super();
		this.withDraw = withDraw;
	}
	@Override
	public String toString() {
		return "Customer [amount=" + amount + ", withDraw=" + withDraw + "]";
	}
	public double getAmount() {
		return amount;
	}
	public double getWithDraw() {
		return withDraw;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setWithDraw(double withDraw) {
		this.withDraw = withDraw;
	}	
}

public class Question_1 {
	public static void main(String[] args) {
		
//		object of Customer Class
		Customer cust = new Customer(20000);
		
//		here is Lambda Expression for functional interface Runnable and override the run() method
		Runnable r1 = ()->{
			String name = null;
			if (cust.withDraw<=cust.amount) {
				name = Thread.currentThread().getName();
				System.out.println(cust.withDraw+" amount successfully by : "+name );
				cust.amount-=cust.withDraw;
			}
			else {
				name = Thread.currentThread().getName();
				System.out.println("sorry ! : "+name);
			}
		};
		
		Thread t1 = new Thread(r1,"Aman");
		Thread t2 = new Thread(r1,"Antriksh");
		
		t1.start();
		t2.start();	}
}
