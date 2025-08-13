package Array;

class Bank{
	String name;

	public Bank(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + "]";
	}
}

public class StoreObjectByForEachLoop {
	public static void main(String[] args) {
//		Array Declare and Allocate the Memory of array
		
//		This is also Write way of array declaration
//		Bank [] banks = new Bank[] {
//				new Bank("SBI"),
//				new Bank("RBI"),
//				new Bank("BIO"),
//		};
		
		Bank [] banks ={
				new Bank("SBI"),
				new Bank("RBI"),
				new Bank("BIO"),
		};
		
//		Apply ForEach Loop
		for(Bank bank : banks) {
			System.out.println(bank);
		}
	}
}
