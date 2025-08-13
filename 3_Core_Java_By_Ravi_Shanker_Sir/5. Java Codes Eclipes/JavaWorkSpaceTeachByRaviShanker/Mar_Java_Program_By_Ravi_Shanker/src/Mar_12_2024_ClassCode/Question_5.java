package Mar_12_2024_ClassCode;

import java.io.IOException;

class Super
{
	public void show() throws Exception
	{
		System.out.println("Super class method not throwing checked Exception");
	}
}
class Sub extends Super
{
	@Override
	public void show() throws IOException  //error
	{
		System.out.println("Sub class method should not throw checked Exception"+9/0);
	}
}

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
