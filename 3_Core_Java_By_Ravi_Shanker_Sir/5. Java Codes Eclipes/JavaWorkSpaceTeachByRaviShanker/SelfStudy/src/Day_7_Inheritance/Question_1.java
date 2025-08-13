package Day_7_Inheritance;

//Single Inheritance

class Nokia1 {
	void fun1() {
		System.out.println("function 1 of Parent class");
	}
	void fun2() {
		System.out.println("function 2 of Parent class");
	}
}
class Nokia2 extends Nokia1{
	void fun3() {
		System.out.println("function 3 of Child class");
	}
	void fun4() {
		System.out.println("function 4 of Child class");
	}
}

public class Question_1 {
	public static void main(String[] args) {
		Nokia2 n1 = new Nokia2();
		n1.fun1();
		n1.fun2();
		n1.fun3();
		n1.fun4();
		}
}
