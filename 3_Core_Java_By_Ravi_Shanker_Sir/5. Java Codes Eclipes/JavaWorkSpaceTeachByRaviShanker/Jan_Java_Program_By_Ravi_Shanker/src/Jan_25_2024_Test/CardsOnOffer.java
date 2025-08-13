package Jan_25_2024_Test;


public class CardsOnOffer{
	
//	private Customer customer;//HAS-A-Relations
	
//	Here apply the constructor 
//	public CardsOnOffer(Customer customer) {
//		this.customer = customer;
//	}
	
//	apply the Condition for Valid Point
	public String getOfferedCard(Customer customer) {
		if(customer.getCreditPoint()>1001) {
			System.out.println();
			return "Platinum";
		}
		else if(customer.getCreditPoint()>500 &&  customer.getCreditPoint()< 1000) {
			return "Gold";
		}
		else if(customer.getCreditPoint()>100 && customer.getCreditPoint()<500) {
			return "Silver";
		}
		else {
				return "EMI";
		}
	}

//	@Override
//	public String toString() {
//		return "CardsOnOffer [customer=" + customer + ", getOfferedCard()=" + getOfferedCard() + "]";
//	}
	
}