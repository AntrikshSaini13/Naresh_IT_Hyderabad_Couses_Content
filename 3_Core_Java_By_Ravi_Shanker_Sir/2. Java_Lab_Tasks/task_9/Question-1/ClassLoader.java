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
		Class.forName("com.ravi.class_loading.Demo");

	}

}

