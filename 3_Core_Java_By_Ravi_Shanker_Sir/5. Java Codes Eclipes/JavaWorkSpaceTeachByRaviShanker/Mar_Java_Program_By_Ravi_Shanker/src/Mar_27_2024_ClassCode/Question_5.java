package Mar_27_2024_ClassCode;

class Sleep extends Thread
{
   @Override
   public void run() 
   {
	   for(int i=1; i<=10; i++)
	   {
		   System.out.println("i value is :"+i);
		   try
		   {
			   Thread.sleep(1000);
		   }
		   catch(InterruptedException e)
		   {
			   System.err.println("Thread is Interrupted "+e);
		   }
	   }
   }
}
public class Question_5 
{
	public static void main(String[] args) 
	{
		Sleep s = new Sleep();
		s.start();
			
	}
}

//Note :- Catch block will not be executed because no other thraed is interrupting the 
//sleeping thread.