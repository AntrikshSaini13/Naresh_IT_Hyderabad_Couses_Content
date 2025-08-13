package Feb_10_2024_ClassCode;

//WAP in java where we want to compare two objects of two different types 


class Employee
{
	private Integer studentId;
	private String studentName;
	public Employee(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
}

class Student
{
   private Integer studentId;
   private String studentName;
	public Student(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}   
	
	@Override
	public boolean equals(Object obj) // obj = s2 -> 1000x
	{
		if(obj instanceof Student)
		{
			Student s2 = (Student)obj;
			if(this.studentId == s2.studentId && this.studentName.equals(s2.studentName))
			{
				return true;
			}
			else
			{
				return false;
			}			
			
		}
		else
		{
			System.err.println("Comparison is not possible");
			return false;
		}
	}	
}

public class Question_2
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "Scott");
		Student s2 = new Student(1, "Scott");		
		Employee e1 = new Employee(1,"Scott");
		
		System.out.println(s1.equals(s2));
		System.out.println(" ");
		System.out.println(s1.equals(e1));
		System.out.println(" ");
		System.out.println(s1.equals(null));
	}
}

//Note :
//
//1) If we compare two different objects then compiler will generate warning as well 
//as by using instanceof operator we can avoid this comparison.
//
//2) null with instanceof operator will always return false.
