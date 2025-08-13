package Jan_22_2024_Class_Code;

class Parent_4{
	
	public Parent_4() {
		System.out.println("No Argunment constructor");
	}
	
	public Parent_4(int num) {
		this();
		System.out.println("Id id is : "+num);
	}
}
class Child_4 extends Parent_4{
	
	public int num2;
	
	public Child_4(int num2,int num) {
		super(num2);
		this.num2 = num;
		System.out.println("Id Of Child Class : ");
	}
	
	public Child_4(int num) {
		
		System.out.println("No Argument constructor of child class"+num);
	}
}

public class Question_9 {
	public static void main(String[] args) {
		Child_4 c1 = new Child_4(25,36);
	}
}