package Mar_30_2024_Lab_Task;

class UserThread implements Runnable
{
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
	}	
}

public class RunnableDemo 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();//this is provide the new thread
		System.out.println(t.getName());// mian
		System.out.println(t.getId());//1
		
		Thread tn = new Thread(new UserThread(),"Child1");
		
		tn.start();
		
				
		Thread t1 = new Thread(new Ravi(),"Ravi");
		t1.start();

		Thread t2 = new Thread(new Rahul(),"Rahul");
		t2.start();
	}

}

class Ravi implements Runnable
{

	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		
	}
	
}

class Rahul implements Runnable
{
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		
	}
	
}
