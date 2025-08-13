package Apr_04_2024_Class_Code;

public class Question_5
{
   public static void main(String[] args) 
   {       
        ThreadGroup myThreadGroup = new ThreadGroup("NIT_Thread");

        // Create and start threads within the ThreadGroup

        Thread thread1 = new Thread(myThreadGroup, new MyRunnable12(), "Thread 1");

        Thread thread2 = new Thread(myThreadGroup, new MyRunnable12(), "Thread 2");

        Thread thread3 = new Thread(myThreadGroup, new MyRunnable12(), "Thread 3"); 
        
        thread1.start();
        thread2.start();
        thread3.start();
		

        // Display information about the ThreadGroup and its threads
        System.out.println("ThreadGroup Name: " + myThreadGroup.getName());

        System.out.println("Active Count: " + myThreadGroup.activeCount());       
    }
}

class MyRunnable12 implements Runnable //static nested inner 
{
        @Override
        public void run() 
	{
            for (int i = 1; i <= 3; i++) 
	    {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try 
		{
                    Thread.sleep(1000);
                } 
		catch (InterruptedException e) 
		{
                    e.printStackTrace();
                }
            }
        }
}

