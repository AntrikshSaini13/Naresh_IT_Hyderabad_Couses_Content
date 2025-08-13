package Feb_12_2024_ClassCode;

abstract class Car
{
	protected int speed = 80;
	
//	Constructor
	public Car()
	{
		System.out.println("Car class Constructor!!");
	}

//	Instance Method
	public void getDetails()
	{
		System.out.println("It has 4 wheels and one Engine");
	}

//	Static Method
	public static void getDetails1()
	{
		System.out.println("It has 4 wheels and one Engine");
	}
	
//	Abstract Method
	public abstract void run();
}


// Sub Class
class Honda extends Car
{
	@Override
	public void run()
	{
		System.out.println("Honda Car is Running");
	}
}

public class Question_2 
{
	public static void main(String[] args) 
	{
		Car c = new Honda();
		System.out.println("Speed is :"+c.speed);
		c.getDetails();
		c.run();
	}
}
