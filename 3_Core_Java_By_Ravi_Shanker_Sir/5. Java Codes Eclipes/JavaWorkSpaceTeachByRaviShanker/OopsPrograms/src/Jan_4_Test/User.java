//In a hypothetical scenario of managing student records, you are tasked with implementing Java classes to handle student details.
//
//
//
//Blc Class (Student Details):
//
//
//
//Define the Blc class representing student details. Include properties (variables) such as studentName (String) and studentID (int).
//
//Implement a non-static method updateDetails within the Blc class that takes parameters to update the studentName and studentID properties using the this keyword.
//
//Elc Class (Student Record Management):
//
//
//
//Describe the purpose of the Elc class in managing student records and its relationship with the Blc class.
//
//Instantiate an object of the Blc class within the Elc class to represent a student.
//
//Demonstrate the usage of the updateDetails method from the Blc class within the Elc class to modify the student's name and ID.


package Jan_4_Test;

public class User {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.setStudentData(112,"Antriksh");
		
	}
}
