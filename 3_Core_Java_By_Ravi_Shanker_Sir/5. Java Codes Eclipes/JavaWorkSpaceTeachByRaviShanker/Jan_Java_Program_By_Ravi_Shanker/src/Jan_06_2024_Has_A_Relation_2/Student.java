package Jan_06_2024_Has_A_Relation_2;

public class Student {

//	Instance Variable
	private int studentId;
	private String studentName;
	private String studentBranch;
	private double studentFee;
	
//	here is Object like HAS-A Relations
	private StudentCollage collage;
	
	public Student(int studentId, String studentName, String studentBranch, double studentFee, StudentCollage collage) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentFee = studentFee;
		this.collage = collage;
	}
	
//	here is apply Getter Method
	public int getStudentId() {
		return studentId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentBranch=" + studentBranch
				+ ", studentFee=" + studentFee + ", collage=" + collage + "]";
	}

	public String getStudentName() {
		return studentName;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public double getStudentFee() {
		return studentFee;
	}
	public StudentCollage getcollage() {
		return collage;
	}
	
}
