package Feb_17_2024_ClassCode;

class A
{
	public void m1()
	{
		System.out.println("M1 method of class A");
	}
}

interface B
{
	default void m1()
	{
		System.out.println("M1 method of interface B");
	}
}

class C extends A implements B
{
	
}

public class Question_1 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.m1();
	}

}