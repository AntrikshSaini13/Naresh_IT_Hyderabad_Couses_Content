package Jan_24_2024_Question_1_ofLab;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(180112, "Antriksh", 25000);
		System.out.println(s1);
		
		System.out.println(s1.displayDetails());
		
//		here Student1 pay fee of Exam only 
		double money = s1.payFee(25000);
		
//		here apply conditions
		if(money > 0) {
			System.out.println("Return money = "+money);
		}
		else if(money < 0){
			System.out.println("Remaining amount to pay is + "+(-money));
		}
		else if(money == 0){
			System.out.println("No Reamin Fee");
		}
	
		
		DayScholer s2 = new DayScholer(180113, "Ankita", 25000, 5000);
		System.out.println(s2.displayDetails());
		
		double money2 = s2.payFee(25000);
		
		if(money2 > 0) {
			System.out.println("Return money = "+money2);
		}
		else if(money2 < 0){
			System.out.println("Remaining amount to pay is + "+(-money2));
		}
		else if(money2 == 0){
			System.out.println("No Reamin Fee");
		}
		
		Hosteller s3 = new Hosteller(180114, "Akshit", 25000, 8000);
		System.out.println(s3);
		
		double money3 = s3.payFee(25000);
		
		if(money3 > 0) {
			System.out.println("Return money = "+money3);
		}
		else if(money3 < 0){
			System.out.println("Remaining amount to pay is + "+(-money3));
		}
		else if(money3 == 0){
			System.out.println("No Reamin Fee");
		}
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
//Create two BLC sub classes of Student called DayScholar and Hosteller. 
//Add the following implementations to each class.
//
//DayScholar:
//
//Instance Variables : transportFee:double ,
//
//Methods: Define parameterized constructor
//
//Hosteller:
//
//Instance Variables: hostelFee :double
//
//Methods: Define parameterized constructor 
//
//Add the following methods in BOTH classes.
//
//Method: displayDetails(): This method should return a string containing the details of the student
//
//in the following format:
//
//Student [name=John Smith,studentId=123,examFee=100.0] OR
//
//DayScholar[transportFee=500, name=John Smith,studentId=123,examFee=100.0] and so on.
//
//Method: payFee(amount): This method takes amount as parameter that represents the fee
//
//provided. You must calculate and then return the remaining amount paid in excess. If excess is
//
//paid, the returned amount will be negative. The total fees that each student must pay must
//
//include all the fees applicable to that Student(examFees, transportFees, hostelFees as applicable).
//
//Subtract the given amount from total fee for each student and return the remaining amount.
//
//An ELC class Tester is given to you with a main method. Use this class to test your solution's
//
//classes and methods.
//
//
//
//Example Output:
//
//Student[name=John Smith,studentId=1,examFee=25000.0]
//
//DayScholar[TransportFee=5000.0,name=Brian Lara,studentId=2,examFee=25000.0]
//
//Remaining amount to pay is: 12000.0
//
//Hosteller[HostelFee=8000.0,name=Virat Kohli,studentId=3,examFee=25000.0]
//
//All Fees are clear

