package Mar_29_2024_ClassCode;

//Case 5 : Writing Lambda in the Constructor of Thread.


public class Question_6 {

	public static void main(String[] args) throws InterruptedException
	{
	new Thread(()-> 
	{
		for(int i=1; i<=100; i=i+2)
		{
			String name = Thread.currentThread().getName();
			System.out.println(i+" by "+name);
		}

	},"Thread1").start();
	
	Thread.sleep(1000);
	System.out.println("............");
	new Thread(()-> 
	{
		for(int i=2; i<=100; i=i+2)
		{
		String name = Thread.currentThread().getName();
			System.out.println(i+" by "+name);
		}	

	},"Thread2").start();
  }
}
