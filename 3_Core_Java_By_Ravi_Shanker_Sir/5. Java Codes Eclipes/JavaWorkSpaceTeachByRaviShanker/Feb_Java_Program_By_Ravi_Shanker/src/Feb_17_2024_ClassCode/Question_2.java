package Feb_17_2024_ClassCode;


interface Alpha
{
	default void m1()
	{
		System.out.println("M1 method of Alpha interface");
	}
}

interface Beta
{
	default void m1()
	{
		System.out.println("M1 method of Beta interface");
	}
}

class Implementer implements Alpha, Beta
{
	@Override
	public void m1() 
	{
		System.out.println("M1 method implemented");	
		Alpha.super.m1();
		Beta.super.m1();
	}	
}

public class Question_2
{
	public static void main(String[] args) 
	{
		new Implementer().m1();

	}
}