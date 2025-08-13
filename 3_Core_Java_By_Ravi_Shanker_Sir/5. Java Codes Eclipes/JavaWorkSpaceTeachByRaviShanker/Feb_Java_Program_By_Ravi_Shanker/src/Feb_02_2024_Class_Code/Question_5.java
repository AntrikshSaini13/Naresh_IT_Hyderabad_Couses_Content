package Feb_02_2024_Class_Code;

//  Co-Varient 

class Alpha
{}
class Beta extends Alpha
{}

class Super1
{
	public Alpha show()
	{
		System.out.println("Super class show method");
		return new Alpha();
	}
}
class Sub1 extends Super1
{
	@Override
	public Beta show() 
	{
		System.out.println("Sub class show method");
		return new Beta();
	}
}

public class Question_5 {

	public static void main(String[] args) 
	{
		Super1 s = new Sub1();
		System.out.println(s.show());

	}

}
