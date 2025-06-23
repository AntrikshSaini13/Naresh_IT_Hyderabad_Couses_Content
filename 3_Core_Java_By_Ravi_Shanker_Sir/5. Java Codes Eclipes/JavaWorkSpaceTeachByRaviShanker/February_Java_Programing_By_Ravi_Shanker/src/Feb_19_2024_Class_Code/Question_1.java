package Feb_19_2024_Class_Code;

class Super
{
	public void show()
	{
		System.out.println("Show method of Super class");
	}
	public void run() {
		System.out.println("Run Method of Super class");
	}
}

public class Question_1 
{
	public static void main(String[] args)
	{
		//Anonymous inner class
		Super sub1 = new Super() {
		   @Override
		   public void show()
		   {
			   System.out.println("Show method of sub class");
		   }	   		  
		};  // semicolumn is compulsarory			
	
		sub1.show();  
		
		Super sub2 = new Super() {
			@Override
			public void run()	{
				System.out.println("Run Method of Sub class");
			}
		};
		
		sub2.run();
		
	}

}
