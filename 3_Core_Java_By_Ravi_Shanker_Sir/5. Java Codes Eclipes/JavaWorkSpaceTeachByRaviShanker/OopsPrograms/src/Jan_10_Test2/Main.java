package Jan_10_Test2;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee(180112,"Amtriksh",34500);
		System.out.println("Employee : "+emp1);
		
		Manager manager1 = new Manager(emp1);
		System.out.println("Manager : "+emp1);
				
		
		
	}
	
	
	

}
//Implement two classes - EMPLOYEE and MANAGER, each having properties id, name, and salary (both classes). Create a 
//parameterized constructor in the EMPLOYEE class and implement a Copy constructor for the MANAGER class, initializing 
//MANAGER with EMPLOYEE properties. Print the properties of the MANAGER class. Explain the significance of the copy constructor in this scenario.
//
//
//
//Brief Explanation:
//
//
//
//EMPLOYEE Class:
//
//
//
//Properties: id, name, salary.
//
//Constructor: Parameterized constructor to set id, name, and salary for an employee.
//
//MANAGER Class:
//
//
//
//Properties: Inherits id, name, salary from EMPLOYEE.
//
//Copy Constructor: Accepts an EMPLOYEE instance, initializes MANAGER properties with EMPLOYEE values.
//
//Significance: Demonstrates a hierarchy where MANAGER shares properties with EMPLOYEE. Copy constructor enables 
//easy creation of MANAGER instances using EMPLOYEE data, promoting code reusability.