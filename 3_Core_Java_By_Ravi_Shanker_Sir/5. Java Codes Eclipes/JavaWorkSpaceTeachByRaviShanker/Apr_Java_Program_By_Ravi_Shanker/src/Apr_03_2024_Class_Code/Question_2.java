package Apr_03_2024_Class_Code;

//Communication between main thread and child thread using ITC

class SecondThread extends Thread 
{
	    int x = 0;

	    @Override
		public void run() 
		{
			//child thread is waiting for lock
			synchronized(this) 
			{
//				System.out.println(this);// here is come Child tread Reference
				for(int i=1; i<=10; i++)
				{
					x =  x + i;
				}
				System.out.println("Sending notification");
				notify();  
			}
	 }
} 
public class Question_2
{
public static void main(String [] args) 
{
		SecondThread b = new SecondThread();  //this is lock
		b.start();// this method internally call run method

		synchronized(b)  //lock is taken by main thread
			{
				//main thread is suspended by Thread Schedular
				try 
				{
					System.out.println("Waiting for b to complete...");
					b.wait(); //main thread will wait and release the lock

					System.out.println("Main thread wake up");
				} 
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println("Value is: " + b.x);
			}		
	}
}


//Note :- Here main thread is waiting for Child Thread to send the notification 
//so, we will get proper output for x
