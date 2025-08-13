package Mar_28_2024_ClassCode;

public class Question_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started");
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		for(int i=1; i<=5; i++)
		{			
			System.out.println(i + " by "+name+ " thread ");
			Thread.sleep(1000);			
		}
		thread.join();  //Deadlock
	
		
		System.out.println("Main thread ended");

	}

}

//Here, It is a deadlock state because main thread is waiting for main thread to complete.