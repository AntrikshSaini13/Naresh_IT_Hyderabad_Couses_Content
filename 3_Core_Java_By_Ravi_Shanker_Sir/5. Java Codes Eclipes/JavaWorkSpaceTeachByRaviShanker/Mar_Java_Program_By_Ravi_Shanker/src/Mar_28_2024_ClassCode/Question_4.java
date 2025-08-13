package Mar_28_2024_ClassCode;

class Run extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Thread is running");	
		System.out.println(Thread.currentThread().getName());
	}	
}

public class Question_4 
{
	public static void main(String[] args) 
	{
	   System.out.println("Main Thread started");
	   
	   
	   Thread t1 = new Thread(new Run(),"AMAN"); // here is target set 
	   t1.start();
	  
		
	}

}