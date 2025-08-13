package Apr_04_2024_Class_Code;

public class Question_4
{
    public static void main(String[] args) 
	{
    	System.out.println("Start main Thread");
        Thread thread = new Thread(new MyRunnable());
        thread.start();
     
        try 
	    {
           Thread.sleep(5000);//main thread is waiting for 3 sec
        } 
		catch (InterruptedException e) 
		{
	            e.printStackTrace();
	    }
	        
	    thread.interrupt();  //child thread interrupted
	    System.out.println("End main Thread");
	}
}

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        try 
	    {
            while (!Thread.currentThread().isInterrupted())
	        {
                System.out.println("Thread is running...");
                Thread.sleep(500);
            }
        } 
		catch (InterruptedException e) 
		{
	            System.out.println("Thread interrupted gracefully.");
	    } 
		finally 
		{
	            System.out.println("Thread resource can be release here.");
		}
    }
}
//Note :- Here main thread is in sleeping mode for 3 sec, after wake up main thread is interrupting 
//child thread so child thread will come out from infinite loop and if any resource is attached 
//with child thread that will be released because child thread execution completed.
//finally block is there to close the resource.
