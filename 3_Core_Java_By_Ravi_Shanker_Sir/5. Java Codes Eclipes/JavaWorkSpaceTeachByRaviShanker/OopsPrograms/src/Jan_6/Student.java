package Jan_6;

public class Student {
	
//	here is instance variable
	private int studentId;
	private String studentName;
	private String studentCourse;
	private int studentAge;
	
//	I am generating here the Parameter Constructor by using Sourse
	public Student(int studentId, String studentName, String studentCourse, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentAge = studentAge;
	}

//	I am Generating the to string method becozof return purpose
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ ", studentAge=" + studentAge + "]";
	}

	
}
