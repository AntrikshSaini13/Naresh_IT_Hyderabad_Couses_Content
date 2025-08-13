package Day_1;

public class Question_5 {

	public static void main(String[] args) {
		System.out.println("Hello Main");
		fun1();
		fun2();
}
}


class Area{
	static void fun1() {
		System.out.println("Fun1 Class Area");
	}
	
	static void fun2() {
		System.out.println("Fun2 Class Area");
	}
}

// Error :
//Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//	The method fun1() is undefined for the type Question_5
//	The method fun2() is undefined for the type Question_5
