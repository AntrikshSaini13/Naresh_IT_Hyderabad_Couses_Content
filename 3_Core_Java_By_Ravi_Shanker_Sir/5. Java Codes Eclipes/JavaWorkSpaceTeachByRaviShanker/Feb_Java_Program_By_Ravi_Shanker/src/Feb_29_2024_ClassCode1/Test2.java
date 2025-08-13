package Feb_29_2024_ClassCode1;

class Student2
{
	static {
		System.out.println("k");
	}
	static void m1() {
		System.out.println("k");
	}
}
public class Test2 
{
	public static void main(String[] args) throws Exception
	{
		Class obj = Class.forName("Feb_29_2024_ClassCode1.Student2");
		System.out.println("Object created for :"+obj.getClass().getName());
		
//		HERE WE ARE ACCES THE NON-STATIC BLOCK
		Student2 s = (Student2) obj;
		s.m1();
	}
}

//javac Test.java
//java Test Student (Here Student class we are passing through Command Line Argument)