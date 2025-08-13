package Mar_11_2024_ClassCode;

public class Question_2 {

	public static void main(String[] args)
	{
		System.out.println(m1());
	}

//	@SuppressWarnings("finally")
	public static int m1()
	{	
		try
		{
			System.out.println("Inside try");
			return 100;
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch");
			return 200;
		}
		finally
		{
			System.out.println("Inside finally");
//			return 300;
		}
		
//		 System.out.println("....");  // Unreachable line
	}
}

//We have return keyword in the program then after this return keywoyd, outside of the 
//finally block we cannot write any kind of statement.
