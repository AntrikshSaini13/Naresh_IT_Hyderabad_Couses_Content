package Feb_17_2024_ClassCode;

interface Callable
{
	public static void call()
	{
		System.out.println("call static method");
	}
}

public class Question_4 implements Callable
{
	public static void main(String[] args) 
	{
		Callable.call();
//		call(); //error
		
		Question_4 s = new Question_4();
//		s.call();//error
		
	}

}