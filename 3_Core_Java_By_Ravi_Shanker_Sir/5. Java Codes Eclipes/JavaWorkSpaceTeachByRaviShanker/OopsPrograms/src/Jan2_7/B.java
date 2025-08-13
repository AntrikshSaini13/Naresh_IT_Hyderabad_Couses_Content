package Jan2_7;

public class B {

	private A obj;// HAS-A Relation A is object of Class A and obj is reference of class A

//	Constructor
	public B(A obj) {
		super();
		this.obj = obj;
	}

//	method
	public void display() {
		obj.show();
	}

}
//Create an another BLC class B
//Instance variable
//private A obj;
//
//Create a parameterized constructor which takes class A as a parameter to initialize the instance variable
//
//Create a display method inside class B which internally calling the show() method of class A