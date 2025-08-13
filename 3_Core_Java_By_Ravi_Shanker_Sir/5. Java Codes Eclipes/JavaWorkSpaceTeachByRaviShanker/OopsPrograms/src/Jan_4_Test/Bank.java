package Jan_4_Test;

//BLC
public class Bank {
	private int  userAccountNumber;
	private static double balance = 10000;
	
	public void setDeposit( int userAccountNumber,double balance){
		this.balance += balance;
		this.userAccountNumber=userAccountNumber;
	}
	public void getBalance(){
		System.out.println("Balance is : "+balance+"Account Number is "+userAccountNumber);
	}
}