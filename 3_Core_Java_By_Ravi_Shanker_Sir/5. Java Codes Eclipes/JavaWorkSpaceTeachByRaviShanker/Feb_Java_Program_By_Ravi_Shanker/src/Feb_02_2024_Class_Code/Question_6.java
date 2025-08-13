package Feb_02_2024_Class_Code;

// Co-varient

class Student
{
	public Object course()
	{
		System.out.println("Generic Course");
		return null;
	}
}
class JavaStudent extends Student
{
	public Float course()
	{
		System.out.println("Java Student");
		return null;
	}
}

public class Question_6 
{
	public static void main(String[] args) 
	{
		Student s = new JavaStudent();  
		s.course();

	}

}