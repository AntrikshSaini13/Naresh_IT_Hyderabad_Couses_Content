package Feb_23_2024_ClassCode;

// Static method reference
@FunctionalInterface
interface Callable {
	public abstract void call(String name);
}

class StaticMethod{
	public static void getName(String name) {
		System.out.println("The name is : "+name);
	}
}

public class Question_1 {
	public static void main(String[] args) {
		
//		By using Lambda Expression
		Callable c1 = str-> StaticMethod.getName(str);
		c1.call("Aman");
		
//		by using Method reference
		Callable c2 = StaticMethod::getName;
		c2.call("Aman");
	}
}