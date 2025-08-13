package Jan_6;
import java.util.*;

//ELC

public class EmpMain {
	public static void main(String[] args) {
//		object creations is here
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Salary : ");
		double sal = sc.nextDouble();
		
//		calling the contructor
		e1.setEmpSalary(sal);
		
		double empSalary = e1.getEmpSalary();
		
		if(empSalary >=4000) {
			System.out.println("You are Devloper...");
		}
		else {
			System.out.println("You are Desiginer...");
		}
		 
	}
}
