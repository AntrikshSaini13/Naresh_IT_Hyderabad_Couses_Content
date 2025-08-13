package Jan_4_Test;

public class Student {
	private int studentId;
	private String studentName;
	
	public void setStudentData(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
}
