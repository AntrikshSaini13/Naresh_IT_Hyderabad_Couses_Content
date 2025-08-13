package Feb_21_2024_ClassCode;

// Suppillier Functional interface is here this is only return type not take any input

import java.util.function.*;


public class Question_5 {
	public static void main(String[] args) {
		
		Supplier <EmployeeData> sup = ()-> new EmployeeData("Aman",15);
		System.out.println(sup.get());;
	}
}


record EmployeeData(String empNmae, int empId){
	
}