package Day_1;

public class StaticMain1 {
	static void fun1() {
		System.out.println("method Fun1 class StaticMain1");
	}
	static void fun2() {
		System.out.println("method Fun2 class StaticMain1\n");
	}
	public static void main(String[] args) {
		System.out.println("Hello Main\n");
		
		// here is static method call for different class
		Static1.fun1();
		Static1.fun2();
		
//		here is static method call same class 
		fun1();
		fun2();
	}
}
