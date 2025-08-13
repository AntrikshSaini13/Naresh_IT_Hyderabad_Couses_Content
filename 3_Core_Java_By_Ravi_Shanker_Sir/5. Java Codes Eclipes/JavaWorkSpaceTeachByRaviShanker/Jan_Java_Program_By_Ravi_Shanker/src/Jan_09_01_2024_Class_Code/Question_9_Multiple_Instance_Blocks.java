package Jan_09_01_2024_Class_Code;

class Multiple_Instance_Blocks{
	private int x;
//	Constructor
	Multiple_Instance_Blocks(){
		x = 600;
		System.err.println("Constructor  : "+x);
	}
	
//	Instance BLocks
	{
		x = 100;
		System.out.println("Instance Block-1 : "+x);
	}
	{
		x = 200;
		System.out.println("Instance Block-2 : "+x);
	}
	{
		x = 300;
		System.out.println("Instance Block-3 : "+x);
	}
	{
		x = 400;
		System.out.println("Instance Block-4 : "+x);
	}
	{
		x = 500;
		System.out.println("Instance Block-5 : "+x);
	}
}

public class Question_9_Multiple_Instance_Blocks {
	public static void main(String[] args) {
		new Multiple_Instance_Blocks();
	}
}

//Output : 
//	Instance Block-1 : 100
//	Instance Block-2 : 200
//	Instance Block-3 : 300
//	Instance Block-4 : 400
//	Instance Block-5 : 500
//	Constructor  : 600


