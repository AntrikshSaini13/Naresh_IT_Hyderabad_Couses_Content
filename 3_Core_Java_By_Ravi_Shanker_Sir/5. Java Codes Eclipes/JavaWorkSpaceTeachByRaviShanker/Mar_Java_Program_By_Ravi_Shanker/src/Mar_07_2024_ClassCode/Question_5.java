package Mar_07_2024_ClassCode;

public class Question_5 
	{
		public static void main(String[] args)
		{
			try
			{
				throw new OutOfMemoryError();
			}
			catch(Throwable e)  
			{
				System.out.println("Inside catch block");
				System.out.println(e);
				
			}
		}

	}