package Mar_16_2024_Lab_Task;

//here is apply the enum class
enum ManagerType1
{
   HR, SALES;
}

class Employee1{
	private String name;
	private int employeeId;
	private double salary;
	
//	here is apply the setter and getter method
	public String getName() {
		return name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	here we are writing the Constructor
	public Employee1() {
		this.name = "Antriksh";
		this.employeeId = 180112;
		this.salary = 120000;
	}
	
	public Employee1(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
//	here is apply the toString method
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}	
}




class Manager1 extends Employee1{
	
//	instance variable
	private ManagerType1 typeOfManager;

//	here wew are apply the setter and getter method 
	public ManagerType1 getTypeOfManager() {
		return typeOfManager;
	}

	public void setTypeOfManager(ManagerType1 typeOfManager) {
		this.typeOfManager = typeOfManager;
	}

//	here is writing the constructor
	public Manager1() {
		super();
	}

	public Manager1(String name, int employeeId, double salary, ManagerType1 typeOfManager) {
		super(name, employeeId, salary);
		this.typeOfManager = typeOfManager;
		this.setSalary(salary);
	}
	
	
// here we are writing the toString method
	@Override
	public String toString() {
		return "Manager1 [typeOfManager=" + typeOfManager + ", getTypeOfManager()=" + getTypeOfManager() + "]";
	}

	//	here we are writing the setSalary method
	@Override
	public void setSalary(double salary) {
		if(typeOfManager == ManagerType1.HR) {
			super.setSalary(salary+10000);
		}
		else if(typeOfManager==ManagerType1.SALES){
			super.setSalary(salary+5000);
		}
	}	
}

class  Clerk1 extends Employee1{
	private int speed;
	private int accuracy;
	
//	here is apply the getter and setter method
	public int getSpeed() {
		return speed;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
//	here is apply  the constructor
	public Clerk1() {
		super();
		
	}
	
	public Clerk1(String name, int employeeId, double salary, int speed, int accuracy) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}
	
	@Override
	public void setSalary(double salary){
		if(speed>70 && accuracy>80) {
			salary+=1000;
			super.setSalary(salary);
		}
		else {
			super.setSalary(salary);
		}
	}
	
//	here is toString method
	@Override
	public String toString() {
		return "Clerk1 [speed=" + speed + ", accuracy=" + accuracy + ", getSpeed()=" + getSpeed() + ", getAccuracy()="
				+ getAccuracy() + ", getName()=" + getName() + ", getEmployeeId()=" + getEmployeeId() + ", getSalary()="
				+ getSalary() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}	
}


public class Question_1 {
	public static void main(String[] args) {
		Manager1 m1 = new Manager1("Antriksh", 180112, 1200000, ManagerType1.HR);
		System.out.println(m1);
		
		Clerk1 c1 = new Clerk1("Aman", 180112, 122222, 80, 90);
		System.out.println(c1);
	}
}
