package Day_3;

class Mahesh{
	int x ;
	private int y;
	
	void fun1() {
		System.out.println("Fun1");
	}
	
	void fun2() {
		System.out.println("Fun2");
	}
}

public class Question_1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Mahesh m1 = new Mahesh();
		
		m1.x = 5;
		
		m1.y = 6;
		
		System.out.println(m1.x);
		
		System.out.println(m1.y);
		
	}
}
