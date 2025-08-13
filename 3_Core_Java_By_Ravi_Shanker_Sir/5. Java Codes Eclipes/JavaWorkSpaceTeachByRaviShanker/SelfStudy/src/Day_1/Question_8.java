package Day_1;

public class Question_8 {
	public static void main(String[] args) {
		Mahesh m1 = new Mahesh();
		m1.fun1();
		m1.fun2();
		System.out.println(m1.y);
		
		System.out.println(m1.x);
	}
}
class Mahesh{
    int x;
	int y;
	
	void fun1() {
		System.out.println("Fun1");
	}
	void fun2() {
		System.out.println("Fun2");
	}
}
