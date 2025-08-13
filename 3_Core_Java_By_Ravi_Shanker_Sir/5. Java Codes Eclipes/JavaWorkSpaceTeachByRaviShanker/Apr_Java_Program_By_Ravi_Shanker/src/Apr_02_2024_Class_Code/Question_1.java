package Apr_02_2024_Class_Code;


//Block level synchronization


class ThreadName
{
	public void printThreadName()
	{		  		
	  String name = Thread.currentThread().getName();
	  System.out.println("Thread inside the method is :"+name);
			
		   synchronized(this)  //synchronized Block
		   {  			   
			for(int i=1; i<=2; i++)
			{
				System.out.println("i value is :"+i+" by :"+name);
			}
			System.out.println(".............................");
		   }		
	}
}
public class Question_1 
{
	public static void main(String[] args)
	{
		ThreadName obj1 = new ThreadName(); //lock is created	
		
		Runnable r1 = () -> obj1.printThreadName();
		
		Thread t1 = new Thread(r1,"Child1"); 
		Thread t2 = new Thread(r1,"Child2"); 
		t1.start(); t2.start();				
	}
}
