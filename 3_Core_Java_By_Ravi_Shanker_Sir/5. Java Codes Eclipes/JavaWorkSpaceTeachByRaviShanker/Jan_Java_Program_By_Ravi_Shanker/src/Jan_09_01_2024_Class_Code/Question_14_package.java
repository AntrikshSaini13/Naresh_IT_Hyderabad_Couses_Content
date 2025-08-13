package Jan_09_01_2024_Class_Code;

public class Question_14_package 

//here we can initialize the value of static-intance variable and Instance-variabke with help of constructor

class Static_Block{
	static int x;
	int y;
	
	public Static_Block(){ // Constructor is Initialize the Static instance variable value when first Create Object
		x = 100;
		y = 200;
	}
	
	public void show() {
		System.err.println("show method");
		System.out.println("value of x : "+x);
		System.out.println("value of x : "+y);
	}
//	Instance Block
	{
		System.out.println("Instance Block");
		System.out.println("value of x : "+x);
		System.out.println("value of x : "+y);
	}
//	Static Block
	static {
		System.out.println("Static Block");
		System.out.println("value of x : "+x);
		//System.out.println("value of x : "+y); // invalid Compilation problem: Cannot make a static reference to the non-static field y
	}
}

public class Question_14_package {
	public static void main(String[] args) {
	
		Static_Block s1 = new Static_Block();
		s1.show();
	}
}

//
//Output :
//	value of x : 100
//	value of x : 200Static_Block {

}
