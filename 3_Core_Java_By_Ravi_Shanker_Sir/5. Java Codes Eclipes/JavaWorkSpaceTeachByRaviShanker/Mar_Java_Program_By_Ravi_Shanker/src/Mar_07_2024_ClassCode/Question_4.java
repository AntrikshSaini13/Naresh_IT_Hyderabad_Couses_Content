package Mar_07_2024_ClassCode;

public class Question_4 
{
	public static void main(String[] args)
	{
		try
		{
			throw new OutOfMemoryError(); // 
		}
		catch(Exception e)  //Throwable is requried here
		{
			System.out.println("Inside catch block");
			System.out.println(e);
			
		}
	}

}
