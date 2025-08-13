package Day_1;

public class Object1Main {
	public static void main(String[] args) {
		
//		here we are create the object of class "Object1" 
		Object1 obj1 = new Object1();
		
		obj1.fun1();
		obj1.fun2();
		
		System.out.println("ELC");
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
//		here is we are the data initlizse with the help of reference
		obj1.x = 51;
		obj1.y = 5;   // here obj1 is reference type of class 'Object1'
		obj1.z = 7;
		
		System.out.println("x : "+obj1.x);
		System.out.println("y : "+obj1.y);
		System.out.println("z : "+obj1.z);
		
		
//		here we can access the data of different beczof here we are use the reference of object class "Object1"
		
		System.out.println("a : "+obj1.a);
		
	}
}
