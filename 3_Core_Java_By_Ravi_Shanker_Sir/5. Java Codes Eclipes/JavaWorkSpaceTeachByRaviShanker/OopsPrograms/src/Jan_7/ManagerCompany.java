package Jan_7;

public class ManagerCompany {
	
//	Instance Variable is here
	
	String companyName;
	String companyLocation;
	
//	here Constructor
	
	public ManagerCompany(String companyName, String companyLocation) {
		super();
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + "]";
	}
	
	

}
