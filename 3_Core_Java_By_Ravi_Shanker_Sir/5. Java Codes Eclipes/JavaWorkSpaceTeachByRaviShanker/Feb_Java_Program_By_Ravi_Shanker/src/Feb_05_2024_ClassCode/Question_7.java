package Feb_05_2024_ClassCode;


class Super3
{
	private void m1()
	{
		System.out.println("Static method of Super class");
	}
}
class Sub3 extends Super3
{
	//Method Hiding
	public static void m1()
	{
		System.out.println("Static method of Sub  class");
	}
}
public class Question_7
{
	public static void main(String[] args) 
	{
		Super3 s1 = new Sub3();
		s1.m1();
		
	}
}
