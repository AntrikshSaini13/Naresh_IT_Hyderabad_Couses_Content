package Feb_06_2024_ClassCode;

// Sealed and non-sealed and final and method override

sealed class OnlineClass permits Laptop, Mobile
{
	public void attendOnlineJavaClass()
	{
		System.out.println("Online Java class on Sunday");
	}
}
non-sealed class Laptop extends OnlineClass
{
	@Override
	public void attendOnlineJavaClass()
	{
		System.out.println("Online Java class by Laptop");
	}
}

final class Mobile extends OnlineClass
{
	@Override
	public void attendOnlineJavaClass()
	{
		System.out.println("Online Java class by Mobile");
	}
}

public class Question_4 
{
	public static void main(String[] args) 
	{
       OnlineClass cls = null;
       cls = new Laptop(); cls.attendOnlineJavaClass();
       cls = new Mobile(); cls.attendOnlineJavaClass();

	}

}

//Output:
//	
//	Online Java class by Laptop
//	Online Java class by Mobile

