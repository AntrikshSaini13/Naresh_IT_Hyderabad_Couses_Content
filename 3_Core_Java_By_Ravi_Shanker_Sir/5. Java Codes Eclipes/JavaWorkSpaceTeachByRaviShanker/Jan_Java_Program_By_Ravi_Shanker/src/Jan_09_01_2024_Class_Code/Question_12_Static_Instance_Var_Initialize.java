package Jan_09_01_2024_Class_Code;

class Static_Instance_Var_Initialize{
	private static int x;
	private int y;
	
//	constructor
	public Static_Instance_Var_Initialize() { 
		x = 100;
		System.out.println("Constructor : "+x);
	}
	
//	static block
	static {
		x=200;
		System.out.println("Static Block-1 : "+x);
	}
	static {
//		y =300;
		System.out.println("Static Block-2 : ");// Error: Unresolved compilation problems:  Cannot make a static reference to the non-static field y
	}
	
//	Instance Block
	{
		x=200;
		System.out.println("Instance Block-1 : "+x); //initialize the static instance variable by instance method
	}
	{
		y =300;
		System.out.println("Instance Block-2 : "+y);
	}
}

public class Question_12_Static_Instance_Var_Initialize {
	public static void main(String[] args) {
		new Static_Instance_Var_Initialize();
	}
}

//Output : 
//	Static Block-1 : 200
//	Static Block-2 : 
//	Instance Block-1 : 200
//	Instance Block-2 : 300
//	Constructor : 100
