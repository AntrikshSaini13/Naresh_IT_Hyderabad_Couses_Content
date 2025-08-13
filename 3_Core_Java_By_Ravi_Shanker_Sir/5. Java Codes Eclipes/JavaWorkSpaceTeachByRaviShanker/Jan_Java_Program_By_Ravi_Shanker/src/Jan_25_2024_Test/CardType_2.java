package Jan_25_2024_Test;

public class CardType_2 extends CardOnOffer_2 {

	private String cardtype;

	public CardType_2(String customerName, int creditPoint) {
		super(customerName, creditPoint);
		this.cardtype = super.getOfferedCard();
	}

	@Override
	public String toString() {
		return super.toString()+" Is Eligible For =" + cardtype +"]";
	}	
}
