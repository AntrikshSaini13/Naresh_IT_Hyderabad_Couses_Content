package Jan_7;

public class ManagerEmployee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	int project;
	
//	here is parameter Constructor
	public ManagerEmployee(int employeeId, String employeeName, double employeeSalary, int project) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.project = project;
	}

//	here is apply the getter becozof get the indivisual data
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public int getProject() {
		return project;
	}
}
