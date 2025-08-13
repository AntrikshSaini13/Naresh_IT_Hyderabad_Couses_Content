package Apr_02_2024_Class_Code;

//Block level synchronization


class ThreadName1
{
	public void printThreadName()
	{		  		
	  String name = Thread.currentThread().getName();
	  System.out.println("Thread inside the method is :"+name);
			
		   synchronized(this)  //synchronized Block
		   {  			   
			for(int i=1; i<=9; i++)
			{
				System.out.println("i value is :"+i+" by :"+name);
			}
			System.out.println(".............................");
		   }		
	}
}
public class Question_2 
{
	public static void main(String[] args)
	{
		ThreadName1 obj1 = new ThreadName1(); //lock is created	
		ThreadName1 obj2 = new ThreadName1(); //lock is created	
		
		Runnable r1 = () -> obj1.printThreadName();//here override the run() method
		Runnable r2 = () -> obj2.printThreadName();//here override the run() method
		
		Thread t1 = new Thread(r1,"Child1"); 
		Thread t2 = new Thread(r2,"Child2"); 
		t1.start(); t2.start();				
	}
}