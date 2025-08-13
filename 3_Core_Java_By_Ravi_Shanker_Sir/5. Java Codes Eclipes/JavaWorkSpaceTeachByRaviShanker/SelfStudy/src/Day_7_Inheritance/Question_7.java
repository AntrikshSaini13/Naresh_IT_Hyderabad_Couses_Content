package Day_7_Inheritance;

// Static Instance Variable How to Access in Parent And Child Class

class Pita{
	static int x;
	static int y;
	void  f1(){
		System.out.println("Parent Class");
		System.out.println("x = "+x+"\ny = "+y);
	}
}

class Bacha extends Pita {
	static int u;
	static int v;
	void  f2(){
		System.out.println("Child Class");
		System.out.println("u = "+u+"\nv = "+v);
	}
}

public class Question_7 {
	public static void main(String[] args) {
		Bacha b1 = new Bacha();
		
//		here we are initialize the variable with the help of class name becozof Static instance variable use Parent and Child name
//		Bacha.u = 25;
//		Bacha.v = 26;
//		Pita.x = 27;
//		Pita.y = 28;				
		
		b1.f1();
		b1.f2();
	}
}
