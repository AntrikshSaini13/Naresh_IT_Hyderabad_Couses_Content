package Jan_25_2024_Test;

public class CardOnOffer_2  extends Customer_2 {

	public CardOnOffer_2(String customerName, int creditPoint) {
		super(customerName, creditPoint);
	}
	
	//	apply the Condition for Valid Point
	public String getOfferedCard() {
		if(super.getCreditPoint()>1001) {
			System.out.println();
			return "Platinum";
		}
		else if(super.getCreditPoint()>500 && super.getCreditPoint() < 1000) {
			return "Gold";
		}
		else if(super.getCreditPoint()>100 && super.getCreditPoint() <500) {
			return "Silver";
		}
		else {
				return "EMI";
		}
	}
	
}
