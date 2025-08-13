package Apr_03_2024_Class_Code;

//Program on notifyAll() method :
//--------------------------------
class Resource 
{
    private boolean flag = false;

    public synchronized void waitMethod() 
    {
		System.out.println("Wait");
       		while (!flag) 
		{
          		try 
		  	{
             			System.out.println(Thread.currentThread().getName() + " is waiting...");
             			wait(); 
          		} 
		  	catch (InterruptedException e) 
		  	{
                		e.printStackTrace();
          		}
        	}
        	System.out.println(Thread.currentThread().getName() + " thread completed!!");
    }

    public synchronized void setMethod() 
    {
		System.out.println("notifyAll");
		this.flag = true;
        System.out.println(Thread.currentThread().getName() + " has make flag value as a true");
        notifyAll(); // Notify all waiting threads that the signal is set
    }
}

public class Question_4 
{
    public static void main(String[] args) 
    {
        Resource r1 = new Resource();  //lock

        Thread t1 = new Thread(() -> r1.waitMethod(), "Child1");
        Thread t2 = new Thread(() -> r1.waitMethod(), "Child2");
        Thread t3 = new Thread(() -> r1.waitMethod(), "Child3");
		
		Thread setter = new Thread(() -> r1.setMethod(), "Setter_Thread");
	
	        t1.start();
	        t2.start();
	        t3.start();
	       
//		main thread is is sleeping mood    
	    try 
		{
	            Thread.sleep(2000);
	        } 
		catch (InterruptedException e) 
		{
	            e.printStackTrace();
	        }
	
	
	        setter.start();
	    }
}

