package Array;

import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	double empFee;
	String empCourse;
	
	public Employee(int stdId, String stdName, double stdFee, String stdCourse) {
		super();
		this.empId = stdId;
		this.empName = stdName;
		this.empFee = stdFee;
		this.empCourse = stdCourse;
	}	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empFee=" + empFee + ", empCourse=" + empCourse
				+ "]";
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpFee() {
		return empFee;
	}

	public String getEmpCourse() {
		return empCourse;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpFee(double empFee) {
		this.empFee = empFee;
	}

	public void setEmpCourse(String empCourse) {
		this.empCourse = empCourse;
	}

	
}

public class StoreObjectInUserDefineArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of object of Array : ");
		int sizeArray = sc.nextInt();
		
//		Array Declare or Memory allocated to array
		Employee employees[];
		employees = new Employee[sizeArray];
		
		for(int i=0; i<employees.length; i++) {
			System.out.print("Enter the empId, empName, empFee, empCourse : ");
			int id = sc.nextInt();
			String name = sc.next();
			double fee = sc.nextDouble();
			String course = sc.next();
			
			employees[i] = new Employee(id, name, fee, course);
		}
		
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
	}
}
