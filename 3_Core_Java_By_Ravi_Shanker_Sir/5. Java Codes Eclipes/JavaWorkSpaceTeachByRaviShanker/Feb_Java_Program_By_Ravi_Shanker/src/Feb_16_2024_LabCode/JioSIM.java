package Feb_16_2024_LabCode;

//JioSIM is sub class of SIMCardInterfaces

public class JioSIM implements SIMCardInterfaces {
	
//	Class instance variable
	private String phNumber;
	private String network;
	private String activations;
	private String deactivations;
	
//	Constructors is here
	public JioSIM() {
		super();
		this.phNumber = "0000000000";
		this.network = "No Network";
		this.activations = "Blank";
		this.deactivations = "Blank";
		
	}

	public JioSIM(String phNumber, String network, String activations, String deactivations) {
		super();
		this.phNumber = phNumber;
		this.network = network;
		this.activations = activations;
		this.deactivations = deactivations;
	}

//  Getter Setter Method is here	
	public String getPhNumber() {
		return phNumber;
	}

	public String getNetwork() {
		return network;
	}

	public String getActivations() {
		return activations;
	}

	public String getDeactivations() {
		return deactivations;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public void setActivations(String activations) {
		this.activations = activations;
	}

	public void setDeactivations(String deactivations) {
		this.deactivations = deactivations;
	}

//	toString Method is here
	@Override
	public String toString() {
		return "JioSIM [phNumber=" + phNumber + ", network=" + network + ", activations=" + activations
				+ ", deactivations=" + deactivations + "]";
	}

	
//	interface class methods override is here

	@Override
	public String phoneNetwork(String network) {
		this.network = network;
		return this.network;
	}

	@Override
	public String SIMActivation(String activations) {
		this.activations = activations;
		return this.activations;
	}

	@Override
	public String SIMdeactivation(String deactivations) {
		this.deactivations= deactivations;
		return this.deactivations;
	}

	@Override
	public String phoneNumber(String phNumber) {
		this.phNumber = phNumber;
		return this.phNumber;
	}

}
