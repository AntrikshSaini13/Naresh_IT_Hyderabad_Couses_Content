package Jan_22_2024_Class_Code;

//here is use super() keyword with passing Argument with super keyword
//parent class 
class Parent_1{
	public Parent_1(String name) {
		System.out.println("My name is :"+name);
	}
}

//Child class
class Child_1 extends Parent_1{
	public Child_1() {
		super("Aman"); // passing argument 
		System.out.println("No Argunment is here of class Child");
	}
}

public class Question_6 {
	public static void main(String[] args) {
		Child c1 = new Child();
	}
}
//
//Output : Parent Class Constructor
//		 Parent Class Constructor