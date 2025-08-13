package Jan_06_2024_Has_A_Relation;

public class Student {
	private int studentId;
	private String studentName;
	private double studentFee;
	private String studentBranch;
	public Student(int studentId, String studentName, double studentFee, String studentBranch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.studentBranch = studentBranch;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", studentBranch=" + studentBranch + "]";
	}
}