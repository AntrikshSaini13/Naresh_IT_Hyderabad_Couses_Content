package Mar_01_2024_ClassCode;

class Foo
{
	static
	{
		System.out.println("static block gets executed...");
	}
}
public class Question_1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("Player");
	}
}
