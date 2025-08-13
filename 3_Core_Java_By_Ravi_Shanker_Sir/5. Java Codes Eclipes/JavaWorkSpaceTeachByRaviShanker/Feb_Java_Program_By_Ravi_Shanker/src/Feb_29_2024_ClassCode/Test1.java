package Feb_29_2024_ClassCode;

class Student1
{
	public void greet()
	{
		System.out.println("Welcome Student");
	}
}
public class Test1 
{
	public static void main(String[] args) throws Exception
	{
	   Object obj = Class.forName(args[0]).newInstance();
	   Student1 s1 = (Student1) obj;
	   s1.greet();
	 
	}
}