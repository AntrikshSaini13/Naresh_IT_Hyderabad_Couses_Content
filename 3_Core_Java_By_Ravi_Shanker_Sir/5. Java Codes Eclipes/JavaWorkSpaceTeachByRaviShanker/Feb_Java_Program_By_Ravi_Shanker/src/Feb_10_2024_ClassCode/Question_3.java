package Feb_10_2024_ClassCode;

// Record Class Example

import java.util.Objects;

class EmployeeClass {
	private int employeeId;
	private String employeeName;

	public EmployeeClass(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return "EmployeeClass [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}

	@Override
	public boolean equals(Object obj) { // obj = e2 ->1000x
		if (this == obj) {
			System.out.println("hello"+this==obj);
			return true;
		}
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClass other = (EmployeeClass) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}
}


              //Canonical Constructor
record EmployeeRecord(int empId, String empName) 
{
	//Compact Constructor
	public EmployeeRecord
	{
		if(empId < 0)
		{
			System.err.println("Invalid ID");
		}
	}
}


public class Question_3 
{
	public static void main(String[] args) 
	{
		EmployeeClass e1 = new EmployeeClass(1, "Scott");
		EmployeeClass e2 = new EmployeeClass(1, "Scott");
		System.out.println(e1.equals(e2));  //calling
		System.out.println(e2);
		System.out.println(e1.getEmployeeName());
		System.out.println(e2.hashCode());
		
		
		System.out.println(".........................");
		EmployeeRecord r1 = new EmployeeRecord(2, "Smith");
		EmployeeRecord r2 = new EmployeeRecord(2, "Smith");
		System.out.println(r1.equals(r2));
		System.out.println(r2);
		System.out.println(r2.empName());
		System.out.println(r2.hashCode());
	}

}

