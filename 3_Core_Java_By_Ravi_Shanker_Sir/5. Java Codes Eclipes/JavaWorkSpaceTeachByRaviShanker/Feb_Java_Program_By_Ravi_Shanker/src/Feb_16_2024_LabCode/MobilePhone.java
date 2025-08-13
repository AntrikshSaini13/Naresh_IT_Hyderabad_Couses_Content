package Feb_16_2024_LabCode;

public class MobilePhone implements MobilePhoneInterface{
	
	private String insertingSim;
	private String removeSim;
	private String call;
	private String message;
	private JioSIM sim; // HAS-A_Relations
		
//	Constructors is here
	public MobilePhone() {
		super();
		this.insertingSim = "No SIM";
		this.removeSim = "NO SIM";
		this.call = "No SIM";
		this.message = "No SIM";
	}
	
	public MobilePhone(String insertingSim, String removeSim, String call, String message, JioSIM sim) {
		super();
		this.insertingSim = insertingSim;
		this.removeSim = removeSim;
		this.call = call;
		this.message = message;
		this.sim = sim;
	}
	
//	Instance Method 
	public void numberJio() {
		System.out.println(sim.getPhNumber());
	}

	public void networkJio() {
		System.out.println(sim.getNetwork());
	}
	public void activationsJio() {
		System.out.println(sim.getActivations());
	}
	public void deactivationsJio() {
		System.out.println(sim.getDeactivations());
	}

//	ToString Method
	@Override
	public String toString() {
		return "MobilePhone [insertingSim=" + insertingSim + ", removeSim=" + removeSim + ", call=" + call
				+ ", message=" + message + ", sim=" + sim + "]";
	}

	
//	Method override
	@Override
	public String insertingSIM(String insertingSim) {
		this.insertingSim =insertingSim;
		return this.insertingSim;
	}

	@Override
	public String removeSIM(String removeSim) {
		this.removeSim = removeSim;
		return this.removeSim;
	}

	@Override
	public String makingCall(String insertingSim) {
		this.insertingSim = insertingSim;
		return this.insertingSim;
	}

	@Override
	public String sendingMessage(String message) {
		this.message = message;
		return this.message;
	}
	
	
}
