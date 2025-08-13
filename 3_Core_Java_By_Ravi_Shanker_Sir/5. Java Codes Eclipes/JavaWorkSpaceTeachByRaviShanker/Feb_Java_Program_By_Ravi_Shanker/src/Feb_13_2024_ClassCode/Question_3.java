package Feb_13_2024_ClassCode;

//	How to makes Sub-Class as Abstract Class

abstract class Alpha
{
	public abstract void show();
	public abstract void demo();	
}

class Beta extends Alpha  //The type Beta must implement the inherited abstract method Alpha.demo()  (Add this class as abstract and immpkements the super class override)
{
	@Override
	public void show() 
	{
	 System.out.println("Show method implemented in Alpha class");		
	}		
}
class Gamma extends Beta
{
	@Override
	public void demo() 
	{
	  System.out.println("Demo method implemented in Beta class");		
	}
}

public class Question_3 
{
	public static void main(String[] args)
	{
		Beta b = new Beta(); b.show(); 
		Alpha a = new Beta(); a.show(); 
		Gamma g = new Gamma(); g.show(); g.demo();
		Alpha a1 = new Gamma(); a1.show(); a1.demo();
	}

}
