package Feb_05_2024_ClassCode;

// private method Overriding

class Super2
{
    static void m1()
	{
		System.out.println("Hello");
	}
}
class Sub2 extends Super2
{
//  method overriding
	static void m1()
	{
		System.out.println("sub");
	}
}
public class Question_6
{
	public static void main(String[] args) 
	{
		Super2 s1 = new Sub2();
		s1.m1();
		
	}
}
