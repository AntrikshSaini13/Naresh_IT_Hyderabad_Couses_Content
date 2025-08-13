package Day_1;

public class Question_9 {
	public static void main(String[] args) {
		
//		Object 1 
		Mahesh1 m1 = new Mahesh1();
		
		m1.fun1();
		m1.fun2();
		
		System.out.println(m1.y);
		
		System.out.println(m1.x);
		
//		object 2 reference same
		m1 = new Mahesh1();
		m1.fun1();
		m1.fun2();
		System.out.println(m1.y);
		
		System.out.println(m1.x);
		
//		object 3 
		Mahesh1 m2 = new Mahesh1();
		m2.fun1();
		m2.fun2();
		System.out.println(m2.y);
		
		System.out.println(m2.x);
	}
}
class Mahesh1{
    int x;
	int y;
	
	void fun1() {
		System.out.println("Fun1");
	}
	void fun2() {
		System.out.println("Fun2");
	}
}
