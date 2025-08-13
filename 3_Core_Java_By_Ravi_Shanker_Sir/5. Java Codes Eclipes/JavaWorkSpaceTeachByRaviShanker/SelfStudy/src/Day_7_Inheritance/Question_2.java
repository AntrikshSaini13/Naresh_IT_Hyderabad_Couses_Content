package Day_7_Inheritance;

// Multiple Inheritance

class A{
	void f1() {
		System.out.println("Function-1 of Parent Class-A");
	}
	void f2() {
		System.out.println("Function-2 of Parent Class-A");
	}
}

class B extends A{
	void f3() {
		System.out.println("Function-3 of Child Class B");
	}
	void f4() {
		System.out.println("Function-4 of Child Class B");
	}
}

class C extends B{
	void f5() {
		System.out.println("Function-5 of Child Class of C");
	}
	void f6() {
		System.out.println("Function-6 of Child Class of C");
	}
}

public class Question_2 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.f1();
		c1.f2();
		c1.f3();
		c1.f4();
		c1.f5();
		c1.f6();
	}
}
