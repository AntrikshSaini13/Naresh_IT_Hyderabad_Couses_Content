package Jan_22_2024_Class_Code;

// to call the super class constructor

//here we are not initialize super keyword compiler automatic added by itself

// parent class
class Parent{
	public Parent() {
		System.out.println("Parent Class Constructor");
	}
}

//child Class
class Child extends Parent{
	public Child() {
		System.out.println("Parent Class Constructor");
	}
}

public class Question_5 {
	public static void main(String[] args) {
		Child c1 = new Child();
	}
}

//
//output
//
//Parent Class Constructor
//Parent Class Constructor