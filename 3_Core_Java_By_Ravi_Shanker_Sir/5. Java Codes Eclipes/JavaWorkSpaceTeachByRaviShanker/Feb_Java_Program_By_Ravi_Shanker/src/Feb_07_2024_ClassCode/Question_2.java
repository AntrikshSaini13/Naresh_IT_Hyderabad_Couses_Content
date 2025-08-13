package Feb_07_2024_ClassCode;

//Composition with final keyword so another Engine Object will not be created


class Engine
{
	private int horsePower;
	private String engineType;
	
	public Engine(int horsePower, String engineType) 
	{
		super();
		this.horsePower = horsePower;
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [horsePower=" + horsePower + ", engineType=" + engineType + "]";
	}
}
class Car 
{
	private String carName;
	private int carModel;
	private final Engine engine; //HAS-A Relation
	
	public Car(String carName, int carModel)
	{
		this.carName = carName;
		this.carModel = carModel;
		this.engine = new Engine(1200, "Battery"); //Composition
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}
}

public class Question_2 {

	public static void main(String[] args) 
	{
		Car c = new Car("Ford", 2024);
		System.out.println(c);
	}

}
