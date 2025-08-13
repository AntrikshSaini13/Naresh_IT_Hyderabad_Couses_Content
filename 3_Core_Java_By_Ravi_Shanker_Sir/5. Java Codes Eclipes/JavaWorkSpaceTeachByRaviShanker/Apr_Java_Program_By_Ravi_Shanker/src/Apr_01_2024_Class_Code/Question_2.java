package Apr_01_2024_Class_Code;

class MyThread implements Runnable
{
	private String str;
	
	public MyThread(String str)
	{
		this.str=str;
	}	
	
	@Override
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+ " : "+i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
			System.err.println(e);
			}
		}
	}
}
public class Question_2
{
	public static void main(String [] args)
	{
		MyThread obj1 = new MyThread("sell the Ticket");  
		MyThread obj2 = new MyThread("Allocate the Seat"); 

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}

