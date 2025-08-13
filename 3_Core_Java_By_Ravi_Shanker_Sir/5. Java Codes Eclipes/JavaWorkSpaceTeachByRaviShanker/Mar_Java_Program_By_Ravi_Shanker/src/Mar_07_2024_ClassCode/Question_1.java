
package Mar_07_2024_ClassCode;

import java.util.*;

public class Question_1 
{
	public static void main(String[] args) 
	{
	  System.out.println("Welcome User, Welcome Here!!!");
	  Scanner sc = new Scanner(System.in);
	  
	  try
	  {
		  System.out.print("Enter the value of x :");
		  int x = sc.nextInt();
		  
		  System.out.print("Enter the value of y :");
		  int y = sc.nextInt();
		  
		  int res = x /y;
		  System.out.println("Result is :"+res);
		  
	  }
	  catch(Exception e)
	  {
		System.err.println("Please don't put zero");  
	  }
	  sc.close();
	  System.out.println("Thank you for visiting application");
	}
}