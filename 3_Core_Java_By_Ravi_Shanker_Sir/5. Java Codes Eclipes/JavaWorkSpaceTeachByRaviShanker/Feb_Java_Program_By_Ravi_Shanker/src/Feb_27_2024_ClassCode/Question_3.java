package Feb_27_2024_ClassCode;

//WAP to show that Platform class loader is the super class for
//Application class loader.

public class Question_3
{
	public static void main(String[] args) 
	{
		ClassLoader loader = Question_3.class.getClassLoader();
		System.out.println("Demo .class is loaded by :"+loader);      
		//Application CL
		
		System.out.println("Super class for Application  CL is :"+loader.getParent()); //Platform CL
		
		System.out.println("Super class for Platform CL is :"+loader.getParent().getParent()); //null
	}
}


//Note :- For BootStrap class laoder, implementaion is not provided by java 
//        software people becuase it is for internal use.