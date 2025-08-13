package Feb_06_2024_ClassCode;



class A
{
	protected int a = 10;
	protected int b = 20;

     public final void calculate()
	  {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	  } 
}
class B extends A
{	
	@Override
	public void calculate() 
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}
public class Question_6
{
	public static void main(String [] args) 
	{
		 A a1 = new B();
		 a1.calculate();
	}
}