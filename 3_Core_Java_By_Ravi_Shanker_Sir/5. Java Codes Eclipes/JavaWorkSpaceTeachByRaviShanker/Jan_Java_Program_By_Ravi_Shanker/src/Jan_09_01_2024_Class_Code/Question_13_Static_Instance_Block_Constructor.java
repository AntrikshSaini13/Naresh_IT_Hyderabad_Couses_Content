package Jan_09_01_2024_Class_Code;

//here we can initialize the value of static-intance variable and Instance-variabke with help of constructor

class Static_Block{
	static int x;
	int y;
	
//	Constructor
	public Static_Block(){ 
		x = 100;
		y = 200;
	}
	
//	show method
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

public class Question_13_Static_Instance_Block_Constructor {
	public static void main(String[] args) {
	
		Static_Block s1 = new Static_Block();
		s1.show();
		 new Static_Block();
		 new Static_Block();
		 
	}
	
}
// Here output zero because Constructor invoke at the End not first 

//Output :
//Static Block
//value of x : 0
//Instance Block
//value of x : 0
//value of x : 0
//show method
//value of x : 100
//value of x : 200