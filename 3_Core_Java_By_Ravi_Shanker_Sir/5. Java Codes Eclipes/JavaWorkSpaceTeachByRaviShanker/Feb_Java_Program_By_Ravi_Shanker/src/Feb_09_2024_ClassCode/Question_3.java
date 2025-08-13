package Feb_09_2024_ClassCode;

class Manager {
	private int managerId;
	private String managerName;

	public Manager(int managerId, String managerName) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
	}

}

public class Question_3 {
	public static void main(String[] args) 
	{
	  Manager m1 = new Manager(111,"Scott");
	  Manager m2 = new Manager(222,"Smith");
	  Manager m3 = new Manager(111,"Scott");
	  
	  System.out.println(m1.equals(m2));
	  System.out.println(m1.equals(m3));

	}

}