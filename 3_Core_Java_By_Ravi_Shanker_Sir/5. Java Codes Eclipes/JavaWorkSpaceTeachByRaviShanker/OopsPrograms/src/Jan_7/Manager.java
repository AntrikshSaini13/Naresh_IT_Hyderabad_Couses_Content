package Jan_7;

//here is employee post as a Manager
public class Manager {
	
//	copy the data employee data as manager
	private int managerId;
	private String managerName;
	private double managerSalary;
	private int project;
	
//	Company data came here as common
	private ManagerCompany company;//HAS-A Relation
	
//	here is passing two parameter 1 copy constructor Second is HAS-A Relations
	public Manager(ManagerEmployee emp,ManagerCompany company) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerSalary = managerSalary;
		this.project = project;
		this.company = company;
	}

// to String method is here its return the String type Data
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerSalary=" + managerSalary
				+ ", project=" + project + ", company=" + company + "]";
	}
	
}