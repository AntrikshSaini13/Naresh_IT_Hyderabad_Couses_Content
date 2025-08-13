package Jan_6;

public class AddressEmployee {
	
//	instance Virable
	private int employeId;
	private String empName;
    private Address address;    //HAS-A relation
    
    
	public AddressEmployee(int employeId, String empName, Address address) {
		super();
		this.employeId = employeId;
		this.empName = empName;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "AddressEmployee [employeId=" + employeId + ", empName=" + empName + ", address=" + address + "]";
	}
}
//Create a class Employee (Business Logic Class)
//Instance Variables: 
//   private int empId;
//   private String empName;
//   private Address address; //HAS-A relation
//Create a parameterized constructor initialize the instance variable of the class.
//
//Override toString() from Object class to print Employee class properties.