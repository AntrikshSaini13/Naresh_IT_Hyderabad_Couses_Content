package Mar_09_2024_ClassCode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{			
			System.out.print("Enter Roll Number :");
			int roll = sc.nextInt();
			System.out.println("Your Roll Number is :"+roll);
			
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input is Invalid");
		}
        finally
        {
        	System.out.println("Finally Block executed");
        	sc.close();
        }
	}

}