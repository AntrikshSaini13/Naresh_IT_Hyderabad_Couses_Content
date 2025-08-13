package Day_2;


class Pro2{
	
	private static int x;
	
	static void f1() {
		x=9;
		System.out.println("x = "+x);
	}
	static void f2() {
		System.out.println("x = "+x);
	}
}

public class Question_4 {
	public static void main(String[] args) {
		System.out.println("Hello main");
		
		Pro1.f1();
		Pro1.f2();
		
		System.out.println(Pro2.x);
	}
}


//
//Error: Unresolved compilation problem: 
//	The field Pro2.x is not visible