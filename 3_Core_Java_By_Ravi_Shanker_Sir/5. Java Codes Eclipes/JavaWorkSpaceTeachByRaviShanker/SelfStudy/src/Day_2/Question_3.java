package Day_2;


class Pro1{
	
	private static int x;// we can access only inside  the class not out side the class
	
	static void f1() {
		x=5;
		System.out.println("x : "+x);
	}
	
	static void f2() {
		System.out.println("x = "+x);
	}
}

public class Question_3 {
	public static void main(String[] args) {
		System.out.println("HEllo");
		
		Pro1.f1();
		Pro1.f2();
	}
}
