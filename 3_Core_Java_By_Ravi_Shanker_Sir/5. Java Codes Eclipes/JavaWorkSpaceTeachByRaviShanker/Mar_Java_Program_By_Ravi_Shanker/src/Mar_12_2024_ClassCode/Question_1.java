package Mar_12_2024_ClassCode;

import java.util.Scanner;
//import java.lang.RuntimeException.*;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{		
	}
	
	public InvalidAgeException(String errorMessage)
	{
	
		super(errorMessage);
		System.out.println("hello");
	}
}

public class Question_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter your Age :");
			int age = sc.nextInt();
			
			if(age < 18)
			{
			   throw new InvalidAgeException("Invalid Age");
			}
			else
			{
				System.out.println("You are eligible for Vote");
			}
		} 
		catch (InvalidAgeException e) 
		{
			System.out.println("Hello2");
			e.printStackTrace();
		}
	}
}