package Jan_09_01_2024_Class_Code;

//if we declare the Constructor private than after inside the class method should be public other we can't access the private Constructor 

class Test{
	Test() {
		System.out.println("Private Antriksh Saini");
	}
	public static void test() {
		Test t1 = new Test();
		System.err.println(t1);
	}	
}

public class Question_3 {
	public static void main(String[] args) {
		Test t1 = new Test();
	}
}
//Output:
//Error: Unresolved compilation problem: 
//	The constructor Test() is not visible