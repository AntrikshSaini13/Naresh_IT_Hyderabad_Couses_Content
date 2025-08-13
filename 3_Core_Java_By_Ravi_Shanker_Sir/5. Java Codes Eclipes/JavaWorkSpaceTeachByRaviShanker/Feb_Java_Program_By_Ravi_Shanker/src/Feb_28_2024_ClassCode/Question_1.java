package Feb_28_2024_ClassCode;

class Foo
{	
	Foo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static
	{
		System.out.println("Static block...");
	}
}
public class Question_1  
{
	public static void main(String [] args)
	{ 		
		System.out.println("Main Method Executed ");				
	}
}


//output : Main Method Executed