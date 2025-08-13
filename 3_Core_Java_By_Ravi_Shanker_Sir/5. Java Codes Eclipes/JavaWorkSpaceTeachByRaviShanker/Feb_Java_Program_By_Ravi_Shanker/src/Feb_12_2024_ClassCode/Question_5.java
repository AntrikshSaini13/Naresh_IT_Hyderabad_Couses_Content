package Feb_12_2024_ClassCode;

class Super{
	public abstract void demo(); //here class not declare abstract
}

class SubClass extends  Super{
	public void demo() {
		System.out.println("sub class");
	}
}


public class Question_5 {
	public static void main(String[] args) {
		Super s1 = new SubClass();
		s1.demo();
	}
}

//Output : .Error: Unresolved compilation problems: 
//	The type Super must be an abstract class to define abstract methods
//	The abstract method demo in type Super can only be defined by an abstract class