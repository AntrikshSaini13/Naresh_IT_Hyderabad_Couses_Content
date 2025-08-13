package Feb_01_2024_Class_Code;

class Bird
{
	public void fly()
	{
      System.out.println("Generic Bird is flying");
	}
}

class Parrot extends Bird
{
	public void fly()
	{
      System.out.println("Parrot Bird is flying");
	}
}

class Peacock extends Bird
{
	public void fly()
	{
      System.out.println("Peacock Bird is flying");
	}
}
public class Question_4
{
	public static void main(String[] args) 
	{
		Bird b;
		
		b = new Bird(); // self object
		b.fly();

        b = new Parrot(); 
		b.fly();  //Dynamic Method Dispatch

        b = new Peacock(); 
        b.fly(); //Dynamic Method Dispatch


	}
}