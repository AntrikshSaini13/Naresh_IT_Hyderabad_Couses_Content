package Feb_29_2024_ClassCode;

class Student
{
}
public class Test 
{
	public static void main(String[] args) throws Exception
	{
	   Object obj = Class.forName(args[0]).newInstance();
	   System.out.println("Object created for :"+obj.getClass().getName());
	}
}

//javac Test.java
//java Test Student (Here Student class we are passing through Command Line Argument)
