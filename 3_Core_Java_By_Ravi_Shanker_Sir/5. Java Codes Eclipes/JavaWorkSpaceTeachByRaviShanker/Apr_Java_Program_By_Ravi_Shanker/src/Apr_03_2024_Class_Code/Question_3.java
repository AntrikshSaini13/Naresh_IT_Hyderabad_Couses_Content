package Apr_03_2024_Class_Code;

class Customer
{  
     int balance = 10000;    

	public synchronized void withdraw(int amount) //amount = 15000  
	{  
		System.out.println("going to withdraw...");    
		if(balance < amount)
			{  
				System.out.println("Less balance; waiting for deposit...");  
					try
					{
						wait();  //waiting and releasing the lock
					}
					catch(Exception e){}  
			}  
		balance  = balance - amount;
		System.out.println("withdraw completed..."+balance+" is remaining balance"); 
	}    

	public synchronized void deposit(int amount)   //amount = 9000
		{  
			System.out.println("going to deposit...");  
			balance = balance + amount;  
			System.out.println("Balance after deposit is :"+balance);
			System.out.println("deposit completed... ");  
			notify();  
		}  
}   
public class Question_3
{  
public static void main(String args[])
	{  
      		Customer c = new Customer();    //lock is created here

		Thread son = new Thread()  //anonymous class concept
		{  
			@Override
			public void run()
			{
				c.withdraw(15000);
			}  
		};
		son.start(); 		

		Thread father = new Thread()
		{  
			public void run()
			{
				c.deposit(9000);
			}  
		};
		
		father.start();  
    }
} 
