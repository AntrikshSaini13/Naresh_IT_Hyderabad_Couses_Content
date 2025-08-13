package Jan_24_2024_Question_1_ofLab;

public class Hosteller extends Student {
	//Instance Variables: hostelFee :double
	public double hostelFee;
	
	//constructor is here


	public Hosteller(int studentId, String studentName, double examFee,double hostelFee) {
	super(studentId, studentName, examFee);
	this.hostelFee = hostelFee;
}

	public String displayDetails()
	{
		return" Hosteller[HostelFee = "+hostelFee+",name = "+studentName+",studentId = "+studentId+",examFee ="+examFee+"]";
	}

	public double payFee(double amount){
		super.amount = amount - hostelFee;
		return amount;
	}
}
//Hosteller:
//
//Instance Variables: hostelFee :double
//
//Methods: Define parameterized constructor 
//
//Add the following methods in BOTH classes.
//
//Method: displayDetails(): This method should return a string containing the details of the student