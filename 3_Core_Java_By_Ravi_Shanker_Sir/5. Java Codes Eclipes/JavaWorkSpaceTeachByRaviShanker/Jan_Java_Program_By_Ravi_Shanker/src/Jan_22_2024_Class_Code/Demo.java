package Jan_22_2024_Class_Code;


class Base
{
	public Base()
	{
		this(15);
		System.out.println("Base class No Argumenet");
	}
	public Base(int x)
	{
		System.out.println("Base class Parametrized :"+x);
	}	
}
class Derived extends Base
{
	int b;
	public Derived(int a, int b) {
		super(a);
		this.b = b;
	}
}


public class Demo
{
	public static void main(String[] args) 
	{
		Derived d1 = new Derived(12,36);
	}
}