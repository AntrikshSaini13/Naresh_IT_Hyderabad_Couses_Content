package Apr_16_2024_Class_Code;
class Outer12    
{  
	  static int x = 25;  
	  static class Inner 
	  {  
			static void msg()
				{
					System.out.println("x value is  "+x);					
				}		
	  }	  
}
public class Question_4
{  
	public static void main(String args[])
	{  
		Outer12.Inner.msg();
	}  
}  

