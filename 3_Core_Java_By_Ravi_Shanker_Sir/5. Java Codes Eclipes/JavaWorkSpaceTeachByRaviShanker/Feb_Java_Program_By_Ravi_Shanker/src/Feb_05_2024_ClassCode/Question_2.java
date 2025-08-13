package Feb_05_2024_ClassCode;

//We cannot override static method but static methods can be inherited as shown in 
//the program below.

class Alpha
{
	static void m1()
	{
		System.out.println("Alpha class method");
	}
}
class Beta extends Alpha
{
	
}

public class Question_2 {

	public static void main(String[] args) 
	{
		Beta.m1();  //calling with sub class name
		Beta b = new Beta(); //calling with sub class object ref
		b.m1();

	}

}