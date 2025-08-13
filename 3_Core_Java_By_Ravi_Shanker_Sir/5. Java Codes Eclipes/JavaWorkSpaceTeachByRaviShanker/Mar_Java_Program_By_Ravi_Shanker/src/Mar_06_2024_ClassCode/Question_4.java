package Mar_06_2024_ClassCode;

public class Question_4 {

	public static void main(String[] args)
	{
		try
		{
			//System.out.println(10/0);
			throw new ArithmeticException();
			
		}
		catch(Exception e)
		{
			System.err.println("Catch");
			System.err.println(e);
		}
		
		
	}

}

//The above program describes how to create and throw an exception object explicitly. try 
//block is doing the same implicitly.