package Feb_05_2024_ClassCode;

//We cannot override any non-static method with static method otherwise we will get error 
//Overriding method is static.

class Alpha2
{
	public  void m1()
	{
		System.out.println("m1 non static method");
	}
}
class Beta2 extends Alpha2
{
	public static void m1()
	{
		System.out.println("m1 static method");
	}
}
public class Question_4 
{
	public static void main(String[] args) 
	{
		Alpha2 a1 = new Alpha2();
		a1.m1();
	}
}

//Out[ut :]
//m1 non static method



//So, the conclusion is we cannot overide static with non static method as well as non-static 
//with static method because static method belongs to class and non-static method belongs to 
//object.
