package Mar_27_2024_ClassCode;

class Demo extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" thread is running.....");	
	}
}
public class Question_4 
{
	public static void main(String[] args) 
	{
	  Thread t =  Thread.currentThread();
	  t.setName("Parent"); //Changing the name of the main thread
	  
	   Demo d1 = new Demo();
	   Demo d2 = new Demo();
	   
	   d1.setName("Child1");
	   d2.setName("Child2");
	   
	   d1.start();  d2.start();
	   
	   String name = Thread.currentThread().getName();
	   System.out.println(name + " Thread is running..");
	}
}
//In the above program we are setting the name of the Thread.
