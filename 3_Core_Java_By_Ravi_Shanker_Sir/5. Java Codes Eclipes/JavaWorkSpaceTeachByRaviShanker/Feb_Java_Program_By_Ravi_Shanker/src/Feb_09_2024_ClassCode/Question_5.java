package Feb_09_2024_ClassCode;

class Student
{
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Student s2 = (Student) obj; //DownCasting
		
		if(this.studentId == s2.studentId && this.studentName.equals(s2.studentName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Question_5 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Rohan");
		Student s2 = new Student(1,"Rohan");
		Student s3 = s2;
		
		System.out.println(s1.equals(s3));
		
//		Student s3 =(Student) new Object();
	}

}
