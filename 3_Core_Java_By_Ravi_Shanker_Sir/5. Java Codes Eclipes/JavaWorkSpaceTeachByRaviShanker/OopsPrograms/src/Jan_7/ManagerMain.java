package Jan_7;


//here we applied the Has relations as well copy constructor also


public class ManagerMain {

	public static void main(String[] args) {
		ManagerEmployee e1 = new ManagerEmployee(180112,"Antriksh",1200000,5);
		
		ManagerCompany c1 = new ManagerCompany("TCS","HYD");
		
		Manager m1 = new Manager(e1,c1);
		
		System.out.println(m1);
		
		
	}
}
