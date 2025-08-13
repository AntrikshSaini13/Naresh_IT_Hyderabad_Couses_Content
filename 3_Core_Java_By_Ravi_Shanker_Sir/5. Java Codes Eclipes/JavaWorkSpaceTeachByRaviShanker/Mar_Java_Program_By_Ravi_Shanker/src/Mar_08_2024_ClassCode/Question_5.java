package Mar_08_2024_ClassCode;

public class Question_5
{
	public static void main(String[] args) 
	{		
		try
		{
			System.out.println("Start Try Block here");
		    int []x = new int[-2];	//We can't pass negative size of an array in negative
		    x[0] = 12;
		    x[1] = 15;
		    System.out.println(x[0]+" : "+x[1]);
		}
		catch(NegativeArraySizeException e)
		{		
			System.err.println("Array Size is in negative value...");
		}
		finally
		{
		   System.out.println("Resources will be handled here!!");		   
		}
		System.out.println("Main method ended!!!");
	}
}

//Note :- In the try block if we write System.exit(0) and if this line is executed then 
//finally block will not be executed.