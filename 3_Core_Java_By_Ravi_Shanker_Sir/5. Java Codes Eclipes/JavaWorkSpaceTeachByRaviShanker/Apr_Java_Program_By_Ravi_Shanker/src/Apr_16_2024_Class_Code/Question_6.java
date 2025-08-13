package Apr_16_2024_Class_Code;
//Anonymous inner class
class Tech
{
     public void tech() 
     {
	      System.out.println("Tech");
     }
}
public class Question_6
{     
     public static void main(String... args)
     {
		   

	       Tech a = new Tech()  //Anonymous inner class
			{
				    @Override
					public void tech() 
					{
						 System.out.println("anonymous tech");
					}

                  

			};
			a.tech();	
     }
}

