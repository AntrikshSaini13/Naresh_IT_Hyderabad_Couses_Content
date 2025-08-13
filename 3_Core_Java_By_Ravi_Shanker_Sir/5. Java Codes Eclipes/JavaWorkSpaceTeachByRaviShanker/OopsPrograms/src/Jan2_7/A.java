package Jan2_7;

public class A {

	private int data = 15;

	public A() {
		super();
		B b = new B(this);
		b.display();
	}

	public void show() {
		System.out.println(data);
	}
}
//Create a BLC class called A
//Instance variable
//private int data = 15;
//
//Create a no-argument constructor, where create the object for class B (Another BLC class) and call the non-static display method available in class B.
//
//Create an instance method show() in class A, which will print instance variable data.
