package Day_7_Inheritance;

// Default Constructor apply of Initialize the value of Instance Variable

class Father{
	int x;
	int y;
	void  f1(){
		System.out.println("Parent Class");
		System.out.println("x = "+x+"\ny = "+y);
	}
}

class Son extends Father {
	int u;
	int v;
	void  f2(){
		System.out.println("Child Class");
		System.out.println("u = "+u+"\nv = "+v);
	}
}

public class Question_6 {
	 public static void main(String[] args) {
		Son s1 = new Son();
		
//		here WE are passing the value with reference variable s1
//		s1.u = 25;
//		s1.v = 63;
//		
//		s1.x = 12;
//		s1.y = 11;
		
		s1.f1();
		s1.f2();
		
		
	}
}
