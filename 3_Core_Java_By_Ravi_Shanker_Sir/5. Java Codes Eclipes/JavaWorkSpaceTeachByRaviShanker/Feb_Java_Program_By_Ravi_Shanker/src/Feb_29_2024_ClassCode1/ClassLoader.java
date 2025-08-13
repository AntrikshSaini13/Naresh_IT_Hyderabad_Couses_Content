package Feb_29_2024_ClassCode1;



class Demo
{
	static
	{
		System.out.println("Static Block of Demo class");
	}
}

public class ClassLoader {

	public static void main(String[] args) throws Exception
	{
		Class.forName("Feb_29_2024_ClassCode1.Demo");

	}

}

//Output : Static Block of Demo class