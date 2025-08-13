package Mar_07_2024_ClassCode;

public class Question_6 
{
	public static void main(String[] args) 
	{
	   System.out.println("Main Started");
	   System.out.println(10/0.0); //Infinity
	   System.out.println(-10/0.0);//-Infinity 
	   System.out.println(0/0.0);  //NaN
	   System.out.println(0/0);//java.lang.ArithmeticException: / by zero
	   System.out.println(10/0); //java.lang.ArithmeticException: / by zero
	   System.out.println("Main Ended");
	}

}