package Mar_08_2024_ClassCode;

public class Question_3
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started!!!");
		try
		{
		   String str1 = "India";
		   System.out.println(str1.toUpperCase());
		   
		   String str2 = "Ravi";
		   int x = Integer.parseInt(str2);
		   System.out.println("Number is :"+x);
		}
		catch(NumberFormatException | NullPointerException  e)
		{
			e.printStackTrace();
		}

		System.out.println("Main method ended!!");
	}

}
