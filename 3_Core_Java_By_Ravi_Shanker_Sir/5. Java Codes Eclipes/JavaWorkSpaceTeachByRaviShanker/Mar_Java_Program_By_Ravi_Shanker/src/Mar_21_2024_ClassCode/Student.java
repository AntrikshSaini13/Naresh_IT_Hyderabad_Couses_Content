package Mar_21_2024_ClassCode;
import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Student implements Serializable {
	private String stdName;
	private int stdId;
	private String stdDep;
	private String course;
	
	public Student() {
		super();
		this.stdName = "Antriksh";
		this.stdId = 180112;
		this.stdDep = "ECE";
		this.course = "B.Tech";
	}
	public Student(String stdName, int stdId, String stdDep, String course) {
		super();
		this.stdName = stdName;
		this.stdId = stdId;
		this.stdDep = stdDep;
		this.course = "B.Tech";
	}
	
	public String getStdName() {
		return stdName;
	}
	public int getStdId() {
		return stdId;
	}
	public String getStdDep() {
		return stdDep;
	}
	public String getCourse() {
		return course;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public void setStdDep(String stdDep) {
		this.stdDep = stdDep;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", stdDep=" + stdDep + ", course=" + course + "]";
	}
	
//	here we are Enter the data to Object
	public Student getStudent() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student name :");
		stdName = sc.next();
		System.out.print("Enter the Student Id :");
		stdId = sc.nextInt();
		System.out.print("Enter the Student Deperment :");
		stdDep = sc.next();
		System.out.print("Enter the Student Course :");
		course = sc.next();
		return new Student(stdName, stdId, stdDep, course);
	}
	
}
