package Array;

class Student{
	int stdId;
	String stdName;
	double stdFee;
	String stdCourse;
	
	public Student(int stdId, String stdName, double stdFee, String stdCourse) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
		this.stdCourse = stdCourse;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + ", stdCourse=" + stdCourse
				+ "]";
	}

	public int getStdId() {
		return stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public double getStdFee() {
		return stdFee;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}	
}

public class StoreObjectInArray {
	public static void main(String[] args) {
//		Array of Student class here we are store the object of Student
//		Array Declare
		Student std [];
//		Allocate the Memory of array
		std =  new Student[5];
		
//		Store  the Object in Array
		std[0] = new Student(101, "Aman", 52000, "B.tech");
		std[1] = new Student(102, "Anikta", 52000, "B.tech");
		std[2] = new Student(103, "Aswal", 52000, "B.tech");
		std[3] = new Student(104, "Saytam", 52000, "B.tech");
		std[4] = new Student(105, "Shivom", 52000, "B.tech");
		
		System.out.println(std[0]);
		System.out.println(std[1]);
		System.out.println(std[2]);
		System.out.println(std[3]);
		System.out.println(std[4]);
		
		std[0].setStdName("Aman Saiani");
		System.out.println(std[0]);
	}
}
