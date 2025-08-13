package Jan_22_2024_Class_Code;

class Parent_5{
	
	public Parent_5() {
		System.out.println("No Argunment constructor");
	}
	
	public Parent_5(int num) {
		this();
		System.out.println("Id id is : "+num);
	}
}
class Child_5 extends Parent_5{
	
	public int num2;
	
	public Child_5(int num2,int num) {
		super.num1;
//		this(num);
		System.out.println("Id Of Child Class : ");
	}
	
	public Child_4() {
		this(25);
		System.out.println("No Argument constructor of child class");
	}
}

public class Question_10 {
	public static void main(String[] args) {
		Child_5 c1 = new Child_5();
	}
}