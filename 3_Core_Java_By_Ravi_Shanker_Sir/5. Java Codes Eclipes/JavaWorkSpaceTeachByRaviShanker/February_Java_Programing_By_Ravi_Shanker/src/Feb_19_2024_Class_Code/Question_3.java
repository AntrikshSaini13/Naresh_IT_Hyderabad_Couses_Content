package Feb_19_2024_Class_Code;

interface Vehicle {
	void run();
}


public class Question_3
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Vehicle bike = new Vehicle()
		{
			@Override
			public void run() 
			{
				System.out.println("Bike is running");				
			}			
		};
		bike.run();
	}

}