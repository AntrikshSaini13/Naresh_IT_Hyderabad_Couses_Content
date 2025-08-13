
package Feb_27_2024_ClassCode;

//The following program explains that java.lang.Class can hold any .class file.

class Player{}

class Employee{}

class Student{}

public class Question_1 
{
	public static void main(String[] args)
	{
		
		Class cls = null;
		
		cls = Player.class;
		System.out.println(cls.getName());
		
		cls = Employee.class;
		System.out.println(cls.getName());
		
		cls = Student.class;
		System.out.println(cls.getName());
		
	}

}