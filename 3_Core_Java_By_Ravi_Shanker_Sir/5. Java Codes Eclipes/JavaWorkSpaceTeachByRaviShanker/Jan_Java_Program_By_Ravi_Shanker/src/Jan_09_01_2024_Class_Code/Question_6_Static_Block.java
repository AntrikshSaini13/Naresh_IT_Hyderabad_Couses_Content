package Jan_09_01_2024_Class_Code;


class Staic_Block {
	public Staic_Block(){
		System.out.println("No Argunment Constructor");
	}
	
//	Static BLock without Method / Block name
	static {
		System.err.println("Static Block");
	}
}

public class Question_6_Static_Block {
	public static void main(String[] args) {
		new Staic_Block();
	}
}

//Output : 
//	No Argunment Constructor
//	Static Block
	
//Static Block
//No Argunment Constructor

	