package Feb_15_2024_ClassCode;

interface Moveable1 
{
//	String nameCar; // here we can't write any instance variable becoze of by default variable is final 
	
   int SPEED = 100; //public + static + final
   void move();  //public + abstract
   
//   public Moveable1() { // inside the interface we can't write the any Constructor
//	   this.SPEED = 10;
//   }
   
//   public void show() {  // inside the interface we can't write the non-static method / instance method 
//	   System.out.println("Show the method");
//   }
   
   	public static void show() {  // inside the interface we can write the static method  
   	System.out.println("Show the method");
   	
//   	default static void show1() {  // inside the interface we can write the static method  (only one of abstract, default, or static permitted)
//   	   	System.out.println("Show the method");
   	
   	
//   	protected static void show2() {  // inside the interface we can write the static method  (only public, private, abstract, default, static and strictfp are permitted)
//   	   	System.out.println("Show the method");
   	
//   	static { // Syntax error on token "static", delete this token
//   		System.out.println("Static");
//   	}
   	
   	{ // its is instance block but internally public + abstract and also implement
   		System.out.println("instance Block");
   	}
}
}

class Car1 implements Moveable1
{
	@Override
	public void move() 
	{
		int num=20;
//		SPEED = 120;	//Invalid	(The final field Moveable1.SPEED cannot be assigned)
		System.out.println("Car speed is :"+(SPEED/num));
	}

}

public class Question_3 {

	public static void main(String[] args) 
	{
		Moveable1 m = new Car1();
		m.move();
		System.out.println(Moveable1.SPEED);
		Moveable1.show();

	}

}

