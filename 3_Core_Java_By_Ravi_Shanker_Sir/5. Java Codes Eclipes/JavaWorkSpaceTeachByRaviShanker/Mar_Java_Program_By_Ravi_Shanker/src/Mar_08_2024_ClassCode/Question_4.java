package Mar_08_2024_ClassCode;

public class Question_4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("Main method ended");
	}

}

//Note :- In the above program finally block will be executed, even
//        we have an exception in the try block.