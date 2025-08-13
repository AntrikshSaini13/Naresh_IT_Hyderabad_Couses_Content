package Feb_13_2024_ClassCode;

abstract class Animal
{
	public abstract void checkup();
}

class Bird extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Bird Check up");		
	}	
}

class Lion extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Lion Check up");		
	}
	
}

class Dog extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Dog Check up");		
	}
	
}

class CheckUp
{
	public static void AnimalCheckUp(Animal animals[])
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}
}

public class Question_6 
{
	public static void main(String[] args) 
	{
		Bird []birds = {new Bird(), new Bird(), new Bird()};
		Lion []lions = {new Lion(), new Lion()};
		Dog [] dogs = {new Dog(), new Dog(), new Dog()};
		
		CheckUp.AnimalCheckUp(birds);
		CheckUp.AnimalCheckUp(lions);
		CheckUp.AnimalCheckUp(dogs);

	}

}
