package Day_1;

public class Object1 {
//	instance variable in different class and different file
	int x;
	int y;
	int z;
	
	int a = 8;

//	instance method in different class and different file
	void fun1() {
		
		Object1 obj2= new Object1();
		
		obj2= new Object1();
		
		obj2.x = 5; 
		
		System.out.println("BLC");
		
		System.out.println("Hello Fun1");
		System.out.println(obj2.x);
		
		System.out.println("a = "+obj2.a);
	}
	
	void fun2() {
		System.out.println("Hello Fun2");
	}
}
