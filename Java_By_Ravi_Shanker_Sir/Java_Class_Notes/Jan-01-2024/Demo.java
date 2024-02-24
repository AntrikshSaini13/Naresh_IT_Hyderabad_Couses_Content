class Alpha1
{
	public static void m1()
	{
		System.out.println("m1 static method");
	}
}
class Beta1 extends Alpha1
{
	@Override
	public void m1()
	{
		System.out.println("m1 non-static method");
	}
}

public class Question_3 
{
	public static void main(String[] args) 
	{
		Alpha1 a1 = new Beta1();
		a1.m1();
	}

}