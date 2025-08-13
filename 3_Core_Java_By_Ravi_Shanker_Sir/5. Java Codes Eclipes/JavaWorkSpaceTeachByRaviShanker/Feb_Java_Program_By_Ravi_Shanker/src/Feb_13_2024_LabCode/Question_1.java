package Feb_13_2024_LabCode;


abstract class Student
{
//	instance variable
	protected String studentName;
	protected String studentClass;
//	static variable
	protected static int totalNumOfStudent;
	
//	constructor 
	
	public Student() {
		super();
		this.studentName = "Antriksh Saini";
		this.studentClass = "12th";
		totalNumOfStudent = 1; 
	}
	
	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNumOfStudent = 1; 
	}
	
//	abstract method
	public abstract double getPercentage();
	
//	get and set method is here
	public static void setTotalNumOfStudent(int NumOfStudent) {
		totalNumOfStudent = NumOfStudent;
	}

	public static int getTotalNumOfStudent() {
		return totalNumOfStudent;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentClass=" + studentClass +"Total number of student = "+getTotalNumOfStudent() +"]";
	}
	
}	

//	here i am declare the ScienceStudent Class
class ScienceStudent extends Student
{
	
	protected double studentMath;
	protected double studentPhysic;
	protected double studentChemistry;	
	protected double totalMarks;
	protected double percentage;

//	Constructor
	public ScienceStudent() {
		super("Aman","12th");
		this.studentMath = 50;
		this.studentPhysic = 50;
		this.studentChemistry = 50;
	}
	
	public ScienceStudent(String studentName, String studentClass, double studentMath, double studentPhysic, double studentChemistry) {
		super(studentName,studentClass);
		this.studentMath = studentMath;
		this.studentPhysic = studentPhysic;
		this.studentChemistry = studentChemistry;
	}

	@Override
	public double getPercentage() {
		this.totalMarks =  studentMath + studentPhysic + studentChemistry ;
		this.percentage = (totalMarks*100)/300;
		return percentage;
	}

	@Override
	public String toString() {
		return "ScienceStudent \n[studentMath=" + studentMath + ", \nstudentPhysic=" + studentPhysic + ", \nstudentChemistry="
				+ studentChemistry + ", \ntotalMarks=" + totalMarks + ", \npercentage=" + percentage + ", \nstudentName="
				+ studentName + ", \nstudentClass=" + studentClass + ", \ngetPercentage()=" + getPercentage()
				+  "]";
	}
}

//	here i am declare the ScienceStudent Class
class HistoryStudent extends Student
{
	
	protected double studentHistory;
	protected double studentGeography;
	protected double studentCivices;	
	protected double totalMarks;
	protected double percentage;

//	Constructor
	public HistoryStudent() {
		super("Prachi","11th");
		this.studentHistory = 50;
		this.studentGeography = 50;
		this.studentCivices = 50;
	}
	
	public HistoryStudent(String studentName, String studentClass, double studentHistory, double studentGeography, double studentCivices) {
		super(studentName,studentClass);
		this.studentHistory = studentHistory;
		this.studentCivices = studentCivices;
		this.studentGeography = studentGeography;
	}

	@Override
	public double getPercentage() {
		this.totalMarks =  studentHistory + studentGeography + studentCivices ;
		this.percentage = (totalMarks*100)/300;
		return percentage;
	}

	@Override
	public String toString() {
		return "HistoryStudent \n[studentHistory=" + studentHistory + ", \nstudentGeography=" + studentGeography
				+ ", \nstudentCivices=" + studentCivices + ", \ntotalMarks=" + totalMarks + ", \npercentage=" + percentage
				+ ", \nstudentName=" + studentName + ", \nstudentClass=" + studentClass + ", \ngetPercentage()="
				+ getPercentage() + "]";
	}		
}


// ELC Class
public class Question_1 {
	public static void main(String[] args) {
		Student s1 ;
		
		
		
		s1 = new ScienceStudent();
//		Student.totalNumOfStudent = 10;
		System.out.println(s1);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		s1 =new HistoryStudent();
		System.out.println(s1);
		
		
	}
}
