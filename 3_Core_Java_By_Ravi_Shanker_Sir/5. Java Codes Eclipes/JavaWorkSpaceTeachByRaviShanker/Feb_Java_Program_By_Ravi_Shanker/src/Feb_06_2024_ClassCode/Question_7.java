package Feb_06_2024_ClassCode;

class A1
{
	protected int a = 10;
	protected int b = 20;

      private final void calculate()
	  {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	  } 
}
class B1 extends A1
{
	public void calculate() 
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}
public class Question_7 
{
	public static void main(String [] args) 
	{
		new B1().calculate();
	}
}
