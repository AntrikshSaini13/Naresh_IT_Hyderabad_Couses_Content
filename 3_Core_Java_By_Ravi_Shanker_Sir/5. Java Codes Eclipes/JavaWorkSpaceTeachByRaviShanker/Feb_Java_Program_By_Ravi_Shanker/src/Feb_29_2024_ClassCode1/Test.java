package Feb_29_2024_ClassCode1;


class Student
{
	public void greet()
	{
		System.out.println("Welcome Student");
	}
}
public class Test 
{
	public static void main(String[] args) throws Exception
	{
	   Object obj = Class.forName("Feb_29_2024_ClassCode1.Student").newInstance();
	   System.out.println("Object created for : "+obj.getClass());
	  
	   Student s1 = (Student) obj;//here is Object class is Super class apply Type Casting Explicitly
	   s1.greet();
	 
	}
}

//Here Student class object is created so we can call greet() non static method of Student class.