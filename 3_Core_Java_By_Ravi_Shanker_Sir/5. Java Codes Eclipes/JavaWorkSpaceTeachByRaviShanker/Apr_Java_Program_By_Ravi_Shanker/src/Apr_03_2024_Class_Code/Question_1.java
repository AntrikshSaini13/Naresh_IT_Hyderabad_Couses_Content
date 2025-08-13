package Apr_03_2024_Class_Code;

//Program that describes if we don't use ITC then the problem is ...

class Test implements Runnable
{
	int var = 0;	
	@Override
	public void run()
	{
		for(int i=1; i<=10; i++)   
		{
			var = var + i;  //var = 1 3 6 10 15 21 28
//			System.out.println(var);
			try
			{
				Thread.sleep(200);
			}
			catch (Exception e)
			{
			}		          
		}
		
	}
}
public class Question_1 
{
	public static void main(String[] args) 
	{		
		Test t = new Test();
		Thread t1 = new Thread(t);		
		t1.start();
		try
		{
			Thread.sleep(200);
		}
		catch (Exception e)
		{
		}		
	    
		System.out.println(t.var);
	}
}