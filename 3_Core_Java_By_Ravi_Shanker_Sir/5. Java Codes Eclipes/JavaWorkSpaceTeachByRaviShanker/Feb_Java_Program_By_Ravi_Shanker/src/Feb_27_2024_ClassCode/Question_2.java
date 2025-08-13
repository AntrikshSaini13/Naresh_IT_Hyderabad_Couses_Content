package Feb_27_2024_ClassCode;

//WAP in java that describes our user defined .class file is loaded by Applicatin class 
//loader.


public class Question_2
{
	public static void main(String[] args) 
	{
		ClassLoader loader = Question_2.class.getClassLoader();
		System.out.println("Demo .class is loaded by :"+loader);
	}
}

//getClassLoader() is a predefined method of class called Class available in java.lang 
//package and it's return type is ClassLoader. 
