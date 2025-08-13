package Jan_22_2024_Class_Code;

// here we are use the this keyword and calling the current class object beczof this keyword point only Current class member 

class Parent_2{
	public Parent_2() {
		System.out.println("Parent class Constructor no argument");
	}
	public Parent_2(String name) {
		this();
		System.out.println("My name is : "+name);
	}
}

class Child_2 extends Parent_2{
	public Child_2() {
		super("Antriksh");
		System.out.println("No Argument Cinstrucotof Child Class");
	}
}

public class Question_7 {
	public static void main(String[] args) {
		Child_2 c1 = new Child_2();
	}
}

//output : Parent class Constructor no argument
//		 My name is : Antriksh
//		 No Argument Cinstrucotof Child Class	

