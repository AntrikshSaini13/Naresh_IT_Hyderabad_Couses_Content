package Mar_21_2024_ClassCode;

import java.io.Serializable;
import java.util.Scanner;

public record Employee(String empName,int empId, double empSalary) implements Serializable{
	public static Employee getEmployee() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Employee name : ");
			String empName = sc.next();
//			empName = sc.nextLine();			
			System.out.print("Enter the Employee Id : ");
			int empId = sc.nextInt();
			
			System.out.print("Enter the Employee Salary : ");
			double empSalary  = sc.nextFloat();
			
			return new Employee(empName, empId, empSalary);
		}
	}
}
