package Jan_09_01_2024_Class_Code;

class Multiple_Static_Block {
	
	public Multiple_Static_Block() {
		System.out.println("Constructor");
	}
	static {
		System.out.println("Static Block-1");
	}
	static {
		System.out.println("Static Block-2");
	}
	static {

		System.out.println("Static Block-3");
	}
	static {
		System.out.println("Static Block-4");
	}
	static {
		System.out.println("Static Block-5");
	}
}

public class Question_10_Multiple_Static_Block {
	public static void main(String[] args) {
		new Multiple_Static_Block();
	}
}

//Output :
//	Static Block-1
//	Static Block-2
//	Static Block-3
//	Static Block-4
//	Static Block-5
//	Constructor
