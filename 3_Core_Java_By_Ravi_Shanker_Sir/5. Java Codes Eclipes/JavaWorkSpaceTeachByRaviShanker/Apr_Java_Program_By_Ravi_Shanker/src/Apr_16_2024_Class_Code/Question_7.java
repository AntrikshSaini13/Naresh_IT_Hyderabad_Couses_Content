package Apr_16_2024_Class_Code;
@FunctionalInterface
interface Vehicle
{
	void move();  //SAM(Single Abstract Method)
}

public class Question_7
{
	public static void main(String[] args) 
	{
		Vehicle car = new Vehicle()
		{
			@Override
			public void move()
			{
				System.out.println("Moving with Car...");
			}
		};
		car.move();

       	Vehicle bike = new Vehicle()
		{
			@Override
			public void move()
			{
				System.out.println("Moving with Bike...");
			}
		};
		bike.move();
	}
}

