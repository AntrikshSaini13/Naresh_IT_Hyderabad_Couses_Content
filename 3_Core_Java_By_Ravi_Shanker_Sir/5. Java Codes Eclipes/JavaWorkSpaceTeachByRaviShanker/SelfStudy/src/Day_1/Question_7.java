package Day_1;

public class Question_7 {
	public static void main(String[] args) {
		System.out.println("Hello main ");
		Object obj1 = new Object();
		obj1.fun1();
		obj1.fun2();
		
		Object obj1 = new Object();
		
	}
}

class Object{
	
//	non static method and instance method of  class Object 
	void fun1() {
		System.out.println("Hello metohid Fun1 Class Object");
	}
	void fun2() {
		System.out.println("Hello metohid Fun1 Class Object");
	}
}

// Error :
//Cannot make a static reference to the non-static method fun1() from the type Object
//Cannot make a static reference to the non-static method fun2() from the type Object