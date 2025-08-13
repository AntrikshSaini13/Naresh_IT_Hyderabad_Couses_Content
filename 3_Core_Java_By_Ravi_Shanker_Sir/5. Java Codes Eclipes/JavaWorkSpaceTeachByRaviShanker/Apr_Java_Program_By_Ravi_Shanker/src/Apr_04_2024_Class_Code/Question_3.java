package Apr_04_2024_Class_Code;

class Interrupt11 extends Thread
{
   public void run()
	{
	   try
	   {
	   Thread.currentThread().interrupt();

	   for(int i=1; i<=10; i++)
		{
		   System.out.println("i value is :"+i);
		   Thread.sleep(1000);
		}

	   }
		catch (InterruptedException e)
		{
			System.err.println("Thread is Interrupted :"+e);
		}
		System.out.println("Child thread completed...");
	}
}
public class  Question_3
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread is started");
		Interrupt11 it = new Interrupt11();
		it.start();
		System.out.println("Main thread is ended");
	}
}

//Here Child Thread is interrupting to itself.
