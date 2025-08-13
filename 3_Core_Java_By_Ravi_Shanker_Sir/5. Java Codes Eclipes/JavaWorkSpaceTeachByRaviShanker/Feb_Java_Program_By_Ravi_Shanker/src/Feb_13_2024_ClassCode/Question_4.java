package Feb_13_2024_ClassCode;


//Program that describes if we don't override abstract methods then sub class will also become 
//as abstract class

abstract class Alpha1
{
	public abstract void show();
	public abstract void demo();	
}

abstract class Beta1 extends Alpha1
{
	@Override
	public void show() 
	{
	 System.out.println("Show method implemented in Alpha class");		
	}		
}
class Gamma1 extends Beta1
{
	@Override
	public void demo() 
	{
	  System.out.println("Demo method implemented in Beta class");		
	}
}

public class Question_4 
{
	public static void main(String[] args)
	{
		Gamma1 g = new Gamma1(); g.show(); g.demo();
	}

}

//Output : Show method implemented in Alpha class
//	 	 Demo method implemented in Beta class