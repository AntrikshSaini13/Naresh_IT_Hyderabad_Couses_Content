package Mar_18_2024_ClassCode;

//Writing constructor with message
enum Season1  
	{
	   SPRING("Pleasant"), SUMMER("UnPleasent"), RAINY("Rain"), WINTER;

     String msg;
	  
	    Season1(String msg)
		{
		  this.msg = msg;
		}

		Season1()
		{
			this.msg = "Cold";
		}

		public String getMessage()
		{
			return msg;
		}
	}
public class Question_4
{	
	public static void main(String[] args) throws Exception
	{
		Season1 s1[] = Season1.values();

		for(Season1 x : s1)
			System.out.println(x+"  is :"+x.getMessage());
	}
}