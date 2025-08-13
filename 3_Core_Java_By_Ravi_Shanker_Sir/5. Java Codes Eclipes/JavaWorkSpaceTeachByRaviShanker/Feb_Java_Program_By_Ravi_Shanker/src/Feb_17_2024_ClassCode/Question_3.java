package Feb_17_2024_ClassCode;

interface Calculator
{
	static double doSum(int x, int y)
	{
		return (x+y);
	}
	
	
	static double doSub(int x, int y)
	{
		return (x - y);
	}
}


public class Question_3 
{
	public static void main(String[] args) 
	{
		double sum = Calculator.doSum(12, 12);
		System.out.println("Sum is :"+sum);
		
	   double sub = Calculator.doSub(100, 50);
	   System.out.println("Sub is :"+sub);
		
	}

}
