package Apr_04_2024_Class_Code;

class Interrupt extends Thread
{
   @Override
   public void run()
   {
	   Thread t = Thread.currentThread();
	   System.out.println(t.isInterrupted()); 
       
	   for(int i=1; i<=10; i++)
	   {
		   System.out.println(i);  
		   try
		   {
			Thread.sleep(1000);
		   }
		   catch (InterruptedException e)
		   {
			   System.err.println("Thread is Interrupted ");
			   e.printStackTrace();
		   }
	   }
    }
}
public class  Question_2
{
	public static void main(String[] args) 
	{
		Interrupt it = new Interrupt();
		System.out.println(it.getState());  // new
		it.start();
		it.interrupt();  //main thread is interrupting the child thread
	}
}

//Here main thread is interrupting the Child Thread.
