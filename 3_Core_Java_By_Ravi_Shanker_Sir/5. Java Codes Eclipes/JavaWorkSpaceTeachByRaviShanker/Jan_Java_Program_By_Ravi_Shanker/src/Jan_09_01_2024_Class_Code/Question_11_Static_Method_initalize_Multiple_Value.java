package Jan_09_01_2024_Class_Code;

class Static_Method_initalize_Multiple_Value {
	
	private static int x;
	
	public Static_Method_initalize_Multiple_Value() { 
		x = 100;
		System.out.println("Constructor : "+x);
	}
	static {
		x=200;
		System.out.println("Static Block-1 : "+x);
	}
	static {
		x =300;
		System.out.println("Static Block-2 : "+x);
	}
}

public class Question_11_Static_Method_initalize_Multiple_Value {
	public static void main(String[] args) {
		new Static_Method_initalize_Multiple_Value();
		new Static_Method_initalize_Multiple_Value();
		new Static_Method_initalize_Multiple_Value();
	}
}

//Output :
//Static Block-1 : 200
//Static Block-2 : 300
//Constructor : 100

