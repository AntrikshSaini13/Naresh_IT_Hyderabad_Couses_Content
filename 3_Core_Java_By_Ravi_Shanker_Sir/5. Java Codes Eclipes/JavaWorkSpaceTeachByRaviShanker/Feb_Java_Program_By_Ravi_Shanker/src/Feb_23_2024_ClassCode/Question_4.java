package Feb_23_2024_ClassCode;

//Program that describes how many methods we can write inside interface upto java 9

interface Moveable{
	
//	abstract method is here
	public abstract void move();
	
//	default method is here
	default void m1() {
		System.out.println("Its a default method inside the interface");
		m3();
		m4();
	}
	
//	static method here
	static void m2() {
		System.out.println("Its a static method inside the interface");
		m3();
	}
	
//	private static method is here
	private static void m3() {
		System.out.println("Its a private Static method inside the interface");
	}
	private void m4() {
		System.out.println("Its priavte non-static method inside the interface");
	}
	
}

class Move implements Moveable{

	@Override
	public void move() {
		System.out.println("Move with my Vehicle");		
	}
	
}

public class Question_4 {
	public static void main(String[] args) {
		Moveable move = new Move();
		
		move.move();
		
		move.m1();
		
		Moveable.m2();
		
	}
}
