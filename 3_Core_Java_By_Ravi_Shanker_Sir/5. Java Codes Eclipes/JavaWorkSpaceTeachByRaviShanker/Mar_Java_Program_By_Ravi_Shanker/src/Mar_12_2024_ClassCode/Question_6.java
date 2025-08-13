package Mar_12_2024_ClassCode;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base
{
	public void show() throws FileNotFoundException
	{
		System.out.println("Super class method ");
	}
}
class Derived extends Base
{
	//throws is applicable but must be equal or sub class
	public void show() throws IOException
	{
		System.out.println("Sub class method ");
	}
}

public class Question_6 
{
	public static void main(String[] args)
	{
	  System.out.println("Overridden method may or may not throw checked exception but if it is throwing then must be same or sub class"+9/0);	
	}
}
