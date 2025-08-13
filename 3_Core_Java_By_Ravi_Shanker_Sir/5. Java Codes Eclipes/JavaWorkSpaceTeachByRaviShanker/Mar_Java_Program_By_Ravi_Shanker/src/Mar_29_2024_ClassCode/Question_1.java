package Mar_29_2024_ClassCode;


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

public class Question_1 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		
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

//public long getId() :- It will a unique positive integer id for each and every thread, 
//it is used to identify the thread during the life cycle of the Thread.
