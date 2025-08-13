package Jan_24_2024_Question_1_ofLab;

public class DayScholer extends Student{
//	instance variable 
	public double transportFee;

	public DayScholer(int studentId, String studentName, double studentFee, double transportFee) {
		super(studentId, studentName, studentFee);
		this.transportFee = transportFee;
	}

	public String displayDetails()
	{
		return "Day Scholer [transportFee= "+transportFee+"Name = "+studentName+"Student Id = "+studentId+"Exam fee = "+examFee+"]";
	}
	
	public double payFee(double amount){
//		this.amount = amount - transportFee;
		return amount - examFee - transportFee;
	}
}
//DayScholar:
//
//Instance Variables : transportFee:double ,
//
//Methods: Define parameterized constructor
//