package Mar_12_2024_ClassCode;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException
{
	public GreaterMarksException()
	{
		
	}
	
	public GreaterMarksException(String errorMessage)
	{
	  super(errorMessage);	
	}
}

public class Question_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter the marks :");
			
			int marks = sc.nextInt();
			
			if(marks > 100)
			{
				throw new GreaterMarksException("Invalid Marks");
			}
			else
			{
				System.out.println("Your Marks is :"+ marks);
			}
		}
		catch(GreaterMarksException e)
		{
			System.err.println(e);
		}
        System.out.println("Main completed");
	}

}
