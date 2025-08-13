package Feb_17_2024_ClassCode;

class A1
{
	public static void m1()
	{
		System.out.println("Static method A");
	}
}
class B1 extends A1
{
	
}
public class Question_6
{
	public static void main(String [] args)
	{
           B1.m1();  //valid
           A1.m1();//valid
           new B1().m1(); //valid
           new A1().m1();  //valid
	}
}
