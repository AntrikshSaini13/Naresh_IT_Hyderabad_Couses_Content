package Feb_28_2024_ClassCode;

class Test
{
	static int x;

	static
	{
		x = 100;
		System.out.println("x value is :"+x);
	}
	
	static
	{
		x = 200;
		System.out.println("x value is :"+x);
	}

	static 
	{
		x = 300;
		System.out.println("x value is :"+x);
	}

	
}
public class Question_2   
{
	public static void main(String[] args) 
	{
		System.out.println(Test.x);
	}
}

//Note :- static blocks are executed according to the order.
