package Mar_28_2024_ClassCode;


class Alpha extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();	//Alpha_Thread		
		
		Beta b1 = new Beta();
		b1.setName("Beta_Thread");
                b1.start();  
                try 
                {
			b1.join(); //Alpha thread is Blocked
			System.out.println("--------------------");
		} 
                catch (InterruptedException e) 
                {			
			e.printStackTrace();
		}
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" by "+name);
		}
		
	}
}

public class Question_3 
{
	public static void main(String[] args) 
	{
		Alpha a1 = new Alpha();
		a1.setName("Alpha_Thread");
		a1.start();
	}
}

class Beta extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();	
		for(int i=1; i<=20; i++)
		{
			System.out.println(i+" by "+name);
		}
		System.out.println(".............");
	}
}
