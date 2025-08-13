package Jan_24_2024_Question_1_ofLab;

public class Student {
	
//	instance variable
	public int studentId;
	public String studentName;
	public double examFee;
	public double amount;//50000
	
//	here constructor
	public Student(int studentId, String studentName, double examFee) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.examFee = examFee;
}
	
//	her is method
	public String displayDetails(){
		return "Student [ name = "+studentName+" Student ID = "+studentId+" Exam Fee = "+examFee+"]" ;
	}

	public double payFee(double amount){
		return amount - examFee;
		
		
	}

	
//	toString method
	@Override
	public String toString() {
		return "Student [StudentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + examFee + "]";
	}
	
}
//A BLC class Student is given to you. It contains the following implementation.
//
//Instance Variables: studentId : int , name :String , examFee:double
//
//Methods: displayDetails(): String , payFee() :double
//
//Define parameterized constructor and a toString method.
//
 