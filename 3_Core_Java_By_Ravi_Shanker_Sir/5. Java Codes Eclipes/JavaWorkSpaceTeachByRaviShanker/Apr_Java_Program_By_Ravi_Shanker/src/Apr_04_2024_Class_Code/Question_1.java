package Apr_04_2024_Class_Code;

class Test implements Runnable
{
	@Override
	public void run()
	{		
		for(int i=1; i<=5; i++)
		{
			String name = Thread.currentThread().getName();

			System.out.println("i value is :"+i+" by thread :"+name);    
			
			 if(name.equals("Child1"))
			{
				Thread.yield();  //Give a chance to Child2 Thread
			}

		}
   }
}
public class Question_1 
{
	public static void main(String[] args) 
	{
		Test obj = new Test();// Object Create here

		Thread t1 = new Thread(obj, "Child1");
		Thread t2 = new Thread(obj, "Child2");
        
		t1.start();  t2.start();
	}
}

//Note :- In real time if a thread is acquiring more time of CPU then to release that 
//	Thread we call yield() method the currently executing Thread.
