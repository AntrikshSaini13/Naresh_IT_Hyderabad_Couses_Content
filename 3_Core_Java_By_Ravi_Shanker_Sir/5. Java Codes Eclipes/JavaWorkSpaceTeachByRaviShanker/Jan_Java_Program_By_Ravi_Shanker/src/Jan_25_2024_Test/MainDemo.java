package Jan_25_2024_Test;

public class MainDemo {
	public static void main(String[] args) {
		Customer p1 = new Customer("Antriksh",10000);
		System.out.println(p1);
		
		
		CardType c1 = new CardType(p1);
		System.out.println(c1);
	}
}

