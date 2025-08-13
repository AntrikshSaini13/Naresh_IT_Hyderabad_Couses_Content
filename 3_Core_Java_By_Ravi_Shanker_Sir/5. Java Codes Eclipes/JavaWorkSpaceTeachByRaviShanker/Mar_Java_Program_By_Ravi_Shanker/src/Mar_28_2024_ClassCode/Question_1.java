package Mar_28_2024_ClassCode;

class Join extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("i value is :"+i);
		}
	}
}


public class Question_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.out.println("Main thread started....");
       
       Join j1 = new Join();
       Join j2 = new Join();
       Join j3 = new Join();
       
       j1.start();      
             
       j1.join();// first of all dead this method than after other task is executed 
       
       j2.start();
             
       j3.start();    
      
      
       System.out.println("Main thread ended....");	
	}

}
