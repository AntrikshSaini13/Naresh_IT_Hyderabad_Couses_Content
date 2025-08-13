package Jan_25_2024_Test;
public class CardType extends CardsOnOffer{
	
	private Customer customer; //Has-A-Relations
	private String cardType;
	public CardType(Customer customer) {
		this.cardType = getOfferedCard(customer);
		this.customer = customer;
	}
	@Override
	public String toString() {
//		this.cardType = super.getOfferedCard(customer);
		return ""+ customer + ",Is Eligible For " + cardType + "]";
	}
		
}