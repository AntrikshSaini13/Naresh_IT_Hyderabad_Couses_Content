package Feb_13_2024_LabCode;

import java.util.*;

abstract class Student1
{
//	instance variable
	protected String studentName;
	protected String studentClass;
//	static variable
	protected static int totalNumOfStudent;
	
//	constructor 
	
	public Student1() {
		super();
		this.studentName = "Antriksh Saini";
		this.studentClass = "12th";
		totalNumOfStudent = 1; 
	}
	
	public Student1(String studentName, String studentClass) {
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
class ScienceStudent1 extends Student1
{
	
	protected double studentMath;
	protected double studentPhysic;
	protected double studentChemistry;	
	protected double totalMarks;
	protected double percentage;

//	Constructor
	public ScienceStudent1() {
		super("Aman","12th");
		this.studentMath = 50;
		this.studentPhysic = 50;
		this.studentChemistry = 50;
	}
	
	public ScienceStudent1(String studentName, String studentClass, double studentMath, double studentPhysic, double studentChemistry) {
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
		return "ScienceStudent  , \nstudentName="+ studentName + ", \nstudentClass=" + studentClass + 
				"\nstudentMath=" + studentMath + ", \nstudentPhysic=" + studentPhysic + ", \nstudentChemistry="+ studentChemistry +
				", \nPercentage=" + getPercentage()
				+  "]";
	}
}

//	here i am declare the ScienceStudent Class
class HistoryStudent1 extends Student1
{
	
	protected double studentHistory;
	protected double studentGeography;
	protected double studentCivices;	
	protected double totalMarks;
	protected double percentage;

//	Constructor
	public HistoryStudent1() {
		super("Prachi","11th");
		this.studentHistory = 50;
		this.studentGeography = 50;
		this.studentCivices = 50;
	}
	
	public HistoryStudent1(String studentName, String studentClass, double studentHistory, double studentGeography, double studentCivices) {
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
				+ ", \nstudentCivices=" + studentCivices 
				+ ", \nstudentName=" + studentName + ", \nstudentClass=" + studentClass + ", \ngetPercentage()="
				+ getPercentage() + "]";
	}		
}


// ELC Class
public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
				
		Student1 s1 ;
				
//		System.out.println("Enter the Student Details");
//		String studentName = sc.nextLine();// here is become Buffer 
//		studentName = sc.nextLine();
//		
//		System.out.println("Enter the Student Details");
//		String className = sc.nextLine();
//		className = sc.nextLine();
	
		 System.out.print("How many Student you wants : ");
		 int numberOfStudent = sc.nextInt();
		 Student.setTotalNumOfStudent(numberOfStudent);
		 System.out.println("Total Student :"+Student.getTotalNumOfStudent());
		 
		 for(int i = 0; i <= numberOfStudent; i++) {
			 
			 System.out.println("Which of type Of Student you wants if Science for enter -> (1) or if History for enter -> (2)");
			 int sub = sc.nextInt();
			 
			 if(sub == 1) {
				 System.out.print("Enter Student Name : ");
				 String stdName = sc.nextLine();
				 stdName = sc.nextLine();
				 
				 System.out.print("Enter the Student Class :");
				 String stdClass = sc.nextLine();
				 stdClass = sc.nextLine();
				 
				 System.out.print("Enter the Math Marks :");
				 double math = sc.nextDouble();
				 
				 System.out.print("Enter the Physice Marks :");
				 double physic = sc.nextDouble();
				 
				 System.out.print("Enter the Cemistory Marks :");
				 double chemistry = sc.nextDouble();
				 
				 s1 = new ScienceStudent1(stdName, stdClass, math, physic, chemistry);
				 System.out.println(s1);
				 System.out.println("--------------------------------------------------------------------------------------------------");
			 }
			 else if(sub == 2) {
				 
				 System.out.print("Enter Student Name : ");
				 String stdName = sc.nextLine();
				 stdName = sc.nextLine();
				 
				 System.out.println("Enter the Student Class :");
				 String stdClass = sc.nextLine();
				 stdClass = sc.nextLine();
				 
				 System.out.print("Enter the Math Marks :");
				 double history = sc.nextDouble();
				 
				 System.out.print("Enter the Math Marks :");
				 double geography = sc.nextDouble();
				 
				 System.out.print("Enter the Math Marks :");
				 double civices = sc.nextDouble();
				 s1 =new HistoryStudent1(stdName, stdClass, history, geography, civices);
				 System.out.println(s1);
				 System.out.println("--------------------------------------------------------------------------------------------------");
			 }
			 else {
				 System.out.println("Spalling Mistake Write");
				 System.out.println("--------------------------------------------------------------------------------------------------");
			 }
			}
		
		
//		s1 = new ScienceStudent1();
//		System.out.println(s1);		
//		System.out.println("----------------------------------------------------------------------------------");
//	
//		s1 =new HistoryStudent1();
//		System.out.println(s1);
//		
		
	}
}
