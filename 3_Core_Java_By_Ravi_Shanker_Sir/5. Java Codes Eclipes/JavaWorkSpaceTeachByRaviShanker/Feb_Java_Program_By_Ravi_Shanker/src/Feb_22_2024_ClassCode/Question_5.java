package Feb_22_2024_ClassCode;

// Method Reference is here
@FunctionalInterface
interface Worker{
	public abstract void work(double salary);
}

class Employee{
	public void Emplloye(double salary) {
		System.out.println("Employee Salayr is : "+salary);
	}
}

public class Question_5 {
	public static void main(String[] args) {
//		by using Lambda Expression
		Worker w = salary-> System.out.println("Employee Salay is Lambda : "+salary);
		w.work(400000);
		
//		by using Method Reference
		Worker w1 = new Employee()::Emplloye;
		w1.work(400000);
	}
}
