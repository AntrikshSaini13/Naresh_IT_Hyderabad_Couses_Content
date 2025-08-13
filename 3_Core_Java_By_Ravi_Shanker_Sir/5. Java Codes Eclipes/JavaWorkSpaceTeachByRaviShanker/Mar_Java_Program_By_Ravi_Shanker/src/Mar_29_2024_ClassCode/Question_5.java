package Mar_29_2024_ClassCode;

//Case 4 :- Runnable by using Lambda

public class Question_5 {

	public static void main(String[] args)
	{
		Runnable r1 = () ->
		{
			Thread t = Thread.currentThread();
			System.out.println(t.getName());
			System.out.println(t.getId());
		};			
				
	    	Thread t1 = new Thread(r1);
	    	t1.start();

	}

}
