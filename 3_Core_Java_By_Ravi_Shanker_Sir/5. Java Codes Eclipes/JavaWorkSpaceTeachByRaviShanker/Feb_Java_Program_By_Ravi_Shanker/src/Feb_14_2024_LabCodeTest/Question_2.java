package Feb_14_2024_LabCodeTest;

abstract class Employee{
	String name;
	int empId;
	public Employee() {
		super();
		this.name = "Antriksh";
		this.empId = 180112;
	}
	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	
	public abstract void calculateSalary();
	public abstract void generatePayStub();
	
	public void displayEmployeeInfo()
	{
		System.out.println("Emp name "+name+"\n emp id "+empId);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	
}


class Superviser extends Employee{
	
	int numberOfSubordinates;
	

	public Superviser(int numberOfSubordinates) {
		super();
		this.numberOfSubordinates = numberOfSubordinates;
	}

	@Override
	public void calculateSalary() {
//		syso
		
	}

	@Override
	public void generatePayStub() {
		
		
	}

	@Override
	public String toString() {
		return "Superviser [numberOfSubordinates=" + numberOfSubordinates + ", name=" + name + ", empId=" + empId + "]";
	}
	
	
	
}






public class Question_2 {
	public static void main(String[] args) {
		Employee e;
		e = new Superviser();
		System.out.println(e);
	}
}
