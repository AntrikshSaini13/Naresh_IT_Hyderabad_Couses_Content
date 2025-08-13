package Feb_02_2024_Class_Code;

//private methods are available within the same class only, it is not visible to the child class so
//we cannot override.

class Super2
{
	private void show()
	{
		System.out.println("Show method of super class!!!!");
	}
}
class Sub2 extends Super2
{
	@Override //error We cannot override private method
	public void show() 
	{
		System.out.println("Show method of sub class!!!!");
	}
}
public class Question_7 
{
	public static void main(String[] args) 
	{
		Super2 s = new Sub2();
		s.show(); //error we can't access private method
	}
}

// Error