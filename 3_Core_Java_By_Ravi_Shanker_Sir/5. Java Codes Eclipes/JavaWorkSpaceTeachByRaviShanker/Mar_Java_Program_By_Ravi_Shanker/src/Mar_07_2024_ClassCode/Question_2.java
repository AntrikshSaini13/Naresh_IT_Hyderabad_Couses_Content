package Mar_07_2024_ClassCode;

public class Question_2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started...");		
		try
		{
			String x = "Ravi";
			int y = Integer.parseInt(x); 
			System.out.println(y);	
		}
		catch(Exception e)
		{
			e.printStackTrace(); //For complete Exception details
			System.out.println("---------------------------------------------------------------------------------------------------------");			
			System.out.println(e.getMessage()); //only for Exception message	
			System.out.println(".............................................................................................................");
			System.out.println(e.toString());			
			System.out.println("..........................................................................................................");
		}
		System.out.println("Main method ended...");		

	}

}
