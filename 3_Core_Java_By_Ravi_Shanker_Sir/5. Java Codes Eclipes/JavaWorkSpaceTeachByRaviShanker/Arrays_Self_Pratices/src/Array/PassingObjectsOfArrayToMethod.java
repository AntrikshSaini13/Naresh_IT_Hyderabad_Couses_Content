package Array;

class Emp{
	int empId;
	String empName;
	
	public Emp() {
		super();
	}
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public void show(Emp [] employees) {
		for(Emp employee : employees) {
			System.out.println(employee);
		}
	}
}

public class PassingObjectsOfArrayToMethod {
	public static void main(String[] args) {
		
//		Array of Emp class
		Emp [] employee = {
				new Emp(101,"Aman"),
				new Emp(102,"Antriksh"),
				new Emp(103,"Aswal"),
				new Emp(104,"Satyam"),
		};
		
//		ememployee.show();
		
//		Calling the show method by Emp Object
		Emp emp = new Emp();
		System.out.println(emp);
	    emp.show(employee);
		
	}
}
