package Apr_16_2024_Class_Code;
class Outer15
{  
	  int x=15;  //error (not possible because try to access instance variable)
	  static class Inner
	  {  
			void msg()
				{
//					System.out.println("x value is  "+x);
				}  
	  }
}
public class Queston_5
{  
	public static void main(String args[])
	{  
		Outer15.Inner obj=new Outer15.Inner();  
		obj.msg();  
	}  
}  
 
