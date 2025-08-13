package Feb_19_2024_ClassCode;

//Case 1:
//------
//Anonymous inner class with Concrete class :
//-------------------------------------------

class Super
{
	public void show()
	{
		System.out.println("Show method of Super class");
	}
	
	public void show1() {
		System.out.println("Sho1");
	}
}

public class Question_1 
{
	public static void main(String[] args)
	{
		//Anonymous inner class
		Super sub = new Super()
		{
		   @Override
		   public void show()
		   {
			   System.out.println("Show method of sub class");
		   }	   
		  
		};  // semicolumn is compulsarory			
	
		sub.show();  
		
		//Anonymous inner class
				Super sub1 = new Super()
				{
				   @Override
				   public void show1()
				   {
					   System.out.println("Show1 method of sub1 class");
				   }	   
				  
				};  // semicolumn is compulsarory			
			
				sub1.show1();  
		
	}

}