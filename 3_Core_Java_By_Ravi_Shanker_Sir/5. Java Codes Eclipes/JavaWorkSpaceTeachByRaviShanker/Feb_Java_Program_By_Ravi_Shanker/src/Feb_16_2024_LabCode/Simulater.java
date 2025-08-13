package Feb_16_2024_LabCode;

public class Simulater {
	public static void main(String[] args) {
		
		
		JioSIM sim = new JioSIM("7302559890","Full Network","Active","Deactivate");		
			
		MobilePhoneInterface myPhone = new MobilePhone("JioSIM","Remove JioSIM","Mummy","Hi Mummy",sim);
		
		((MobilePhone) myPhone).numberJio();	
		
		myPhone = new MobilePhone("JioSIM","Rmove","Call","Messae",sim);
		
		System.out.println(myPhone.insertingSIM("JioSim")+"\n"+myPhone.makingCall("Hello Mommy")+"\n"+myPhone.removeSIM("Remove The sim")+"\n"+myPhone.sendingMessage("Call Mummy")+"\n");
		
}
}