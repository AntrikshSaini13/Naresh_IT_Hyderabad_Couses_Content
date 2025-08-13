package Jan_25_2024_Test;

public class MainInheritance {
	public static void main(String[] args) {
		
		
		CardType_2 card1 = new CardType_2("Antriksh",5000);
		System.out.println(card1);
		
		CardType_2 card2 = new CardType_2("aman", 500);
		card2.setCreditPoint(100);
		
		System.out.println(card2);
	}
}
