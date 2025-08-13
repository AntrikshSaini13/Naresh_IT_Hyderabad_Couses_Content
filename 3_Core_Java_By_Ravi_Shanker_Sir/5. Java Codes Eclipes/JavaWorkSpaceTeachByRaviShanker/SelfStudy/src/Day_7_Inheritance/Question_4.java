package Day_7_Inheritance;



// Single Inheritance with Constructor 

class Parent{
	Parent(){
		System.out.println("Constructor of Parent class");
	}
	void f1(){
		System.out.println("Function 1 Parent class");
	}
}
class Child extends Parent {
	Child(){
		System.out.println("Constructor Of Child class");
	}
	void f1(){
		System.out.println("Function 1 Parent class");
	}
}

public class Question_4 {
	public static void main(String[] args) {
		Child t = new Child();
		
	}
}