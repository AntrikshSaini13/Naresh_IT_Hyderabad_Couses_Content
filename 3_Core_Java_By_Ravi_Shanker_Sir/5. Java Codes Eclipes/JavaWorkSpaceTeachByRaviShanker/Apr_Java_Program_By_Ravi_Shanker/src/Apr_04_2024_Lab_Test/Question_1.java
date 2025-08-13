package Apr_04_2024_Lab_Test;

//Write a program to show that join() method put a thread into wait mode 
//till the completion of another thread.


class ThreadName
{
	public void printThreadName()
	{		  		
	  String name = Thread.currentThread().getName();
	  System.out.println("Thread inside the method is :"+name);		   		   
			for(int i=1; i<=10; i++)
			{
				System.out.println("i value is :"+i+" by :"+name);
			}
			System.out.println(".............................");
		  	
	}
}
public class Question_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadName obj1 = new ThreadName(); //lock is created	
		
		Runnable r1 = () -> obj1.printThreadName();
		
		Thread t1 = new Thread(r1,"Child1"); 
		Thread t2 = new Thread(r1,"Child2"); 
		t1.start(); 
		t1.join();
		t2.start();				
	}
}