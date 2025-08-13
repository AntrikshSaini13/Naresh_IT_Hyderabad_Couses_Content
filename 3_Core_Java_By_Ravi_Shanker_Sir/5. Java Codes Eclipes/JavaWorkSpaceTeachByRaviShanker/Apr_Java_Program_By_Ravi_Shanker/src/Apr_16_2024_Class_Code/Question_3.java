package Apr_16_2024_Class_Code;
class Outer
{  
	   static int x=15;  

	  static class Inner
	  {  
	     void msg()
		{
		System.out.println("x value is  "+x);
		}  
	  }
}
public class Question_3
{  
	public static void main(String args[])
	{  
		Outer.Inner obj=new Outer.Inner();  
		obj.msg();  
	}  
} 

