package Mar_26_2024_ClassCode;

class Foo extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child thread is running...");
		System.out.println("It is running with separate stack");		
	}	
}
public class Question_3 
{
	public static void main(String[] args)
	{
		System.out.println("Main Thread is started..");			
		Foo f = new Foo(); 		
        System.out.println("Thread has not started yet so :"+f.isAlive());	
		
		f.start(); //new Thread has created			
		System.out.println("Thread has started  so :"+f.isAlive());
		
		Foo f1 = new Foo();
	    f1.start();   //java.lang.IllegalThreadStateException	
	    System.out.println("Thread has started  so :"+f.isAlive());
	    
	    f1.start();   //java.lang.IllegalThreadStateException	
    }
}
