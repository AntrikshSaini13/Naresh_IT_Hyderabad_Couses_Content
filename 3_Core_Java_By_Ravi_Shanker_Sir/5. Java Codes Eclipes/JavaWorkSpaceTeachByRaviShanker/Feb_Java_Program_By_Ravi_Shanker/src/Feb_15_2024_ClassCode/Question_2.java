package Feb_15_2024_ClassCode;

import java.util.Scanner;


//inter face class
interface Bank
{
	
//	abstract method
	public void deposit(int amount);
	public void withdraw(int amount);
}


//sub Class use the keywprd of implements
class Customer implements Bank
{
    private double balance = 10000;
    
	@Override
	public void deposit(int amount) 
	{
		if(amount < 0)
		{
			System.err.println("Can't be deposited");
		}
		else
		{
			balance = balance + amount;
			System.out.println("After deposit :"+balance);
		}
	}

	@Override
	public void withdraw(int amount) 
	{
		if(amount < balance)
		{
		 balance = balance - amount;
		 System.out.println("Balance after withdraw :"+balance);
		}
		else
		{
			System.err.println("Insufficient Balance ");
		}
		
	}	
}

public class Question_2 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount u want to deposit :");
		int dep = sc.nextInt();
		c1.deposit(dep);
		
		System.out.print("Enter the amount u want to withdraw :");
		int wit = sc.nextInt();
	    c1.withdraw(wit);
		sc.close();
	}

}
