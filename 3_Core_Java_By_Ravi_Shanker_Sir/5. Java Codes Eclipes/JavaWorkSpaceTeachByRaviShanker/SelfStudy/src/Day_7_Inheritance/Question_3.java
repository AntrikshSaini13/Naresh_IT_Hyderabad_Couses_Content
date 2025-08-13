package Day_7_Inheritance;

// Hierarchial Inheritance

class One {
//	One (){
//		System.out.println("Hello Parent");
//	}
	void f1() {
		System.out.println("Function-1 of Parent class");
	}
	void f2() {
		System.out.println("Function-2 of Parent class");
	}
}

class Two extends One{
//	Two(){
//		System.out.println("HEllo Child");
//	}
	void f3() {
		System.out.println("Function-3 of child class");
	}
	void f4() {
		System.out.println("Function-4 of child class");
	}
}

class Three extends One{
	void f3() {
		System.out.println("Function-5 of child class");
	}
	void f4() {
		System.out.println("Function-6 of child class");
	}
}

public class Question_3 {
	 public static void main(String[] args) {
		 Two t1 = new Two();
		 
		 Three t2 = new Three();
		 
		 t1.f1();
		 t1.f3();
//		 
		 t2.f1();
		 t2.f3();
//		
	}
}
