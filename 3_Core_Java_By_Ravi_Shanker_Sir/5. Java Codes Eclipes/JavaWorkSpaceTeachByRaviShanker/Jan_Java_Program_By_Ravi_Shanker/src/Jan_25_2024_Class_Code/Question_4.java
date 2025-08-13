package Jan_25_2024_Class_Code;

//Composition

class Engine 
{
	private String engineType;
	private int engineHorsePower;

	public Engine(String engineType, int engineHorsePower) 
	{
		super();
		this.engineType = engineType;
		this.engineHorsePower = engineHorsePower;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", engineHorsePower=" + engineHorsePower + "]";
	}	
}

class Car {
	private String carName;
	private int carModel;
	private Engine engine; // HAS-A Relation

	public Car(String carName, int carModel) 
	{
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.engine = new Engine("Petrol",1200);  //Composition
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}

	
}



public class Question_4 {

	public static void main(String[] args) 
	{
	  Car c1 = new Car("Naxon", 2024);
	  System.out.println(c1);
	  
	  Car c2 = new Car("Ford",2023);
	  System.out.println(c2);
	}
}