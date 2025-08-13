package Feb_02_2024_Class_Code;

class Super3
{
	public void show()
	{
		System.out.println("Show method of super class!!!!");
	}
}
class Sub3 extends Super3
{
	@Override
	public void show() 
	{
		System.out.println("Show method of sub class!!!!");
	}
}
public class Question_8 
{
	public static void main(String[] args) 
	{
		new Sub3().show(); //we can call that way also	
	}
}