package Jan_09_01_2024_Class_Code;


class Static_Instance_Block {
	public Static_Instance_Block(){
		System.out.println("No Argunment Constructor");
	}
	
//	Instance BLock without Method / Block name
	{
		System.out.println("Instance Block");
	}
//	Static BLock without Method / Block name
	static {
		System.err.println("Static Block");
	}
}

public class Question_7_Static_Instance_Block {
	public static void main(String[] args) {
		new Static_Instance_Block();
	}
}


//Output :
//	Static Block
//	Instance Block
//	No Argunment Construct