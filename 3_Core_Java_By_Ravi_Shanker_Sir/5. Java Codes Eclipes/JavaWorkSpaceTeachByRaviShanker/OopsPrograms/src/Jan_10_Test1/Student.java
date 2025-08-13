package Jan_10_Test1;

public class Student {
	String name ;
	int age ;
	char grade;
	
//	default constructor 
	Student() {
		this.name = "Antriksh";
		this.age = 18;
		this.grade = 'A';
	}

//	parameter constructor
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}

//	parameter constructor
	public Student(String name ,int age, char grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	

}
//Student Class
//
//
//
//Consider a Student class with attributes for name, age, and grade. Discuss how constructor overloading can be utilized for the following situations:
//
//
//
//a) Creating a default student with a generic name, age of 18, and grade set to 'A'.
//
//
//
//b) Enrolling a new student with a specified name and age, but without specifying the grade.
//
//
//
//c) Admitting a student with all details provided - name, age, and a specific grade.
//
//
//
//Explanation:
//
//
//
//a) Design a constructor that sets default values for a generic name, age of 18, and a grade 'A'.
//
//
//
//b) Create a constructor that takes parameters for name and age, leaving the grade as a default value or unspecified.
//
//
//
//c) Implement a constructor that takes parameters for name, age, and grade, allowing the admission of a student with all details specified.