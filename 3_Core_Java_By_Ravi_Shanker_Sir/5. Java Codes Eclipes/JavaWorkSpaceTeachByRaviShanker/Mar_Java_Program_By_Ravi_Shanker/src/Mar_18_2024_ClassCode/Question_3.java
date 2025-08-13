package Mar_18_2024_ClassCode;

enum Season
{
	WINTER, SUMMER, SPRING, RAINY;   //All are object of type enum
  
	Season()
	{
		System.out.println("Constructor is executed....");
	}	
}
public class Question_3 
{
	public static void main(String[] args) 
	{
		System.out.println(Season.WINTER);
		System.out.println(Season.SUMMER);
		
	}
}