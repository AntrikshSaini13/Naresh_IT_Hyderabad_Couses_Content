package Jan_09_01_2024_Class_Code;


class Instance_Block {
	public Instance_Block(){
		System.out.println("No Argunment Constructor");
	}
	
//	Instance BLock without Method / Block name
	{
		System.out.println("Instance Block");
	}
}

public class Question_5_Instance_Block {
	public static void main(String[] args) {
		new Instance_Block(); 
	}
}

//Output :
//	Instance Block
//	No Argunment Constructor
