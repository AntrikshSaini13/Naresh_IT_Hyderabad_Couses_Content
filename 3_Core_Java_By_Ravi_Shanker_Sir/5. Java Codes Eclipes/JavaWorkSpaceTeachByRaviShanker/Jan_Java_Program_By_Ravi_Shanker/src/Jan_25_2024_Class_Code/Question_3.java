package Jan_25_2024_Class_Code;

//Aggregation

import java.util.*;

class AadharCard {
	private String aadharNumber;
	private String issuingAuthority;

	public AadharCard(String aadharNumber, String issuingAuthority) {
		super();
		this.aadharNumber = aadharNumber;
		this.issuingAuthority = issuingAuthority;
	}

	@Override
	public String toString() {
		return "AadharCard [aadharNumber=" + aadharNumber + ", issuingAuthority=" + issuingAuthority + "]";
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}
	
}


class Citizen {
	private String citizenAddress;
	private String citizenName;
	private AadharCard aadharCard; // HAS-A Relation

	public Citizen(String citizenAddress, String citizenName, AadharCard aadharCard) {
		super();
		this.citizenAddress = citizenAddress;
		this.citizenName = citizenName;
		this.aadharCard = aadharCard;
	}

	public String validateAadharCard() 
	{
		if (aadharCard.getAadharNumber().length() == 12) {
			return "It is a valid Aadhar Card :" + this.aadharCard;
		} else {
			return "Not a valid Aadhar Card";
		}

	}

	@Override
	public String toString() {
		return "Citizen [citizenAddress=" + citizenAddress + ", citizenName=" + citizenName + ", aadharCard="
				+ aadharCard + "]";
	}

}


public class Question_3

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Aadhar number :");
		String aadharNo = sc.nextLine();
		
		System.out.print("Enter Issuing Authority Name :");
		String auth = sc.nextLine();
		
		AadharCard a = new AadharCard(aadharNo, auth);
		Citizen c = new Citizen("Ameerpet", "Scott", a);		
		String card = c.validateAadharCard();      
		System.out.println(card);
		System.out.println(c);	

	}

}
