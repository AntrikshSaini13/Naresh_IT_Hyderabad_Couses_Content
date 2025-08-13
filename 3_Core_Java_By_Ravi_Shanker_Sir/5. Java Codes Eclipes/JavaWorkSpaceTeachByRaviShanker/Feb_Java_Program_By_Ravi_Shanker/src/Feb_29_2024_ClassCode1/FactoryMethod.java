package Feb_29_2024_ClassCode1;


//The method which returns the class name itself by creating the object for that particular 
//class is called Factory Method.
//
//Class cls = Class.forName("com.ravi.Test");
//
//Here Test.class will be loaded into JVM memory and it will return Class class object so 
//further we can call any method of java.lang.Class class.

public class FactoryMethod {

	public static void main(String[] args) throws Exception
	{
		Class name = Class.forName("java.lang.Class");
		System.out.println(name.getName());
		System.out.println(name.getPackage());
	}
}

//Any method which is returning the class object then it is known as Factory Method.