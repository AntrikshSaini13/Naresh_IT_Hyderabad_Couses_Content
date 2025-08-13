package Feb_15_2024_ClassCode;



interface Moveable 
{
   int SPEED = 100; //public + static + final
   void move();  //public + abstract
}



class Car implements Moveable
{
	@Override
	public void move() 
	{
		//SPEED = 120;	//Invalid	
		System.out.println("Car speed is :"+SPEED);
	}

}




public class Question_1 {

	public static void main(String[] args) 
	{
		Moveable m = new Car();
		m.move();
		System.out.println(Moveable.SPEED);

	}

}
