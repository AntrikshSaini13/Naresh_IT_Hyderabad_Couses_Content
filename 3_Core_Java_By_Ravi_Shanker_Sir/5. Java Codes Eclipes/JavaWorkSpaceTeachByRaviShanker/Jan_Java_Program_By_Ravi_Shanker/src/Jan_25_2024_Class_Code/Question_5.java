package Jan_25_2024_Class_Code;

import java.util.*;

//Association

class Student 
{
	
	private int studentId;
	private String studentName;
	private double studentFees;
	private int studentAge;
	
	public Student(int studentId, String studentName, double studentFees, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", studentAge=" + studentAge + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public double getStudentFees() {
		return studentFees;
	}

	public int getStudentAge() {
		return studentAge;
	}
}



class Trainer 
{
   public void getStudentProfile(Student s)  //s = s1
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Student id :");
	 int id = sc.nextInt();
	 
	 if(id == s.getStudentId())
	 {
		 System.out.println(s);
	 }
	 else
	 {
		 System.err.println("No such student is available!!!");
	 }
	 
	 
   }
}

public class Question_5 {

	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"John",12900,24);
		
		Trainer t1 = new Trainer();
		t1.getStudentProfile(s1);
		
		System.out.println(".......................");
//		Trainer.getStudentProfile(new Student(2,"Scott",25000,25));
	}

}
