package Apr_03_2024_Class_Code;

public class Question_5
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
				
		System.out.println(t.getPriority());
		
		Thread t1 = new Thread();
		System.out.println(t1.getPriority());
	}

}
