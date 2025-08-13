package Feb_12_2024_ClassCode;

abstract class Bird
{
	public abstract void fly();	
}
class Parrot extends Bird
{
	@Override
	public void fly()
	{
		System.out.println("Parrot can fly");
	}
	
	public void fly1() {
		System.out.println("Parrot1 can fly");
	}
}
class Sparrow extends Bird
{
	@Override
	public void fly()
	{
		System.out.println("Sparrow can fly");
	}
}

public class Question_1 
{
	public static void main(String[] args) 
	{
		Bird b;

		b = new Parrot(); b.fly();
		b = new Sparrow(); b.fly();
	}
}
