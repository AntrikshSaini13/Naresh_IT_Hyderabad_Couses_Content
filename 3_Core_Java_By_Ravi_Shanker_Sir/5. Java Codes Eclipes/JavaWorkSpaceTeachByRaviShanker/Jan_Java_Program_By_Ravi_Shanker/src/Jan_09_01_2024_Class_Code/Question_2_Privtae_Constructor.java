package Jan_09_01_2024_Class_Code;

// if we declare the Constructor private than after inside the class method should be public other we can't access the private Constructor 

class Test{
	private Test() {
		System.out.println("Private Antriksh Saini");
	}
	public static void test() {
		Test t1 = new Test();
		System.err.println(t1);
	}
	
}

public class Question_2_Privtae_Constructor {
	public static void main(String[] args) {
		Test.test();
	}
}

//output:
//
//Private Antriksh Saini
//Jan_09_01_2024_Class_Code.Test@372f7a8d