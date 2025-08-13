package Mar_29_2024_ClassCode;

//Case 1: Creating Anonymous Thread class using reference :
//----------------------------------------------------------

public class Question_2 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				Thread t = Thread.currentThread();
				System.out.println(t.getName());
				System.out.println(t.getId());
			}
		};
        t1.start();
        
	}

}
