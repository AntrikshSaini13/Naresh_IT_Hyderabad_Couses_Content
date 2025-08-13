package Day_2;

class Hello{
	
//	
	static int x;
	
	static void f1() {
		
		x=1;
		
		System.out.println("x = "+x);
		}
	
	static void f2() {
		System.out.println("x = "+x);
	}
}

public class Question_2 {
 public static void main(String[] args) {
	System.out.println("Hello Main");
	
	System.out.println("x = "+Hello.x);
	
	Hello.f1();
	Hello.f2();
	
	System.out.println("x = "+Hello.x);
}
}

//Error: Unresolved compilation problem: 
//	The field Hello.x is not visible
