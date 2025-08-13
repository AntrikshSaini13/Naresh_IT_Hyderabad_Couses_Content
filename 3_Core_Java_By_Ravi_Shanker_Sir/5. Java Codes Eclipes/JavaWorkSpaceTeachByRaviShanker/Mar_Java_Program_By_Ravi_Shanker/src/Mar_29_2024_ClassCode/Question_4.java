package Mar_29_2024_ClassCode;

//Case 3 : Creating Thread with Anonymous approach using Runnable


public class Question_4 {

	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable()
		{
			@Override
			public void run()
			{
				Thread t = Thread.currentThread();
				System.out.println(t.getName());
				System.out.println(t.getId());
			}  
	   	};
	    	Thread t1 = new Thread(r1);
	    	t1.start();
		

	}

}