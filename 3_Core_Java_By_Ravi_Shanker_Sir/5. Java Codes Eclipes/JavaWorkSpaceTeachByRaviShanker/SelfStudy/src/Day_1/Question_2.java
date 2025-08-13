package Day_1;

public class Question_2 {
	void fun1() {
		System.out.println("fun1");
	}
	void fun2() {
		System.out.println("fun2");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		fun1();
		fun2();
	}
}
// Error :
//Cannot make a static reference to the non-static method fun1() from the type Question_2
//Cannot make a static reference to the non-static method fun2() from the type Question_2