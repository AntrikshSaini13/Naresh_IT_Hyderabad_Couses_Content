package Feb_28_2024_ClassCode;

class Foo1
{	
	static int x;

    	static
	{		
		System.out.println("x value is :"+x);
	}	
}

public class Question_3 
{
	public static void main(String[] args) 
	{
		 new Foo1();
	}
}

//Note :- static variables are also initialized with default value.
