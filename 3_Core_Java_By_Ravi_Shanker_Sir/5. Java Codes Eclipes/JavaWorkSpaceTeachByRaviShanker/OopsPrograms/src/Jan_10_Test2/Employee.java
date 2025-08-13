package Jan_10_Test2;

public class Employee {
	private int employeId ;
	private String name;
	private double salary;
	public Employee(int employeId, String name, double salary) {
		super();
		this.employeId = employeId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
