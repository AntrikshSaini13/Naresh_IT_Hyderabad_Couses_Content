package Jan_22_2024_Class_Code;

// this(int num) calling parameterized Constructor of class parent class

//Parent class
class Parent_3{
	
	public Parent_3() {
		this(25);
		System.out.println("No Argunment constructor");
	}
	
	public Parent_3(int num) {
		System.out.println("Id id is : "+num);
	}
}
class Child_3 extends Parent_3{
	
}

public class Question_8 {
	public static void main(String[] args) {
		Child_3 c1 = new Child_3();
	}
}


//Output : Id id is : 25
//	     No Argunment constructor