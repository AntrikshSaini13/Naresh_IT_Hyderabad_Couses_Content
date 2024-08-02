// package Java_Lab_Tasks.task_9.question-1;

//BLC -> Business Logic class here is only of Logic Not a main method.

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
