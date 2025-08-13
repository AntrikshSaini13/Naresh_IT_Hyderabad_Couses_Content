package Feb_28_2024_ClassCode;

//Interview Quaestion :
//----------------------
//AD  BC  EF
class  A         
{
	static 
	{
		System.out.println("A");
	}

	 
	{
		System.out.println("B");
	}

	A() 
	{		
		System.out.println("C");
	}
}
class B extends A
{
	static 
	{
		System.out.println("D");
	}

	 
	{
		System.out.println("E");
	}

	B() 
	{		
		System.out.println("F");
	}

}
public class Question_5 
{
	public static void main(String[] args) 
	{
		new B();
	}
}
