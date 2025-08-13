package Mar_28_2024_Lab_Test;

// Write a java program to return Customer object where the properties are customerId, customerName and customerSalary by using Supplier functional interface. 
//
//Print the customer data using toString() method.


import java.util.function.Supplier;

public class Question_1 {
	public static void main(String[] args) {
		
		Supplier <EmployeeData> sup = ()-> new EmployeeData("Aman",15, 120000);
		System.out.println(sup.get());
	}
}

record EmployeeData(String empNmae, int empId, int Salary){
	
}
