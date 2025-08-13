package jan_22_2023_Question_2;

// Parent / Super Class

public class SmartHomeDevice {
//	instance variable
	private String type;
	private boolean status;
	
	//	parameterized constructor
	public SmartHomeDevice(String type) {
		super();
		this.type = type;

	}
	
//	here we are apply getter and setter
	public String getType() {
		return type;
	}


	public boolean isStatus() {
		return status;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	//	Check for lightDevice and ThermostatDevice on 
	public void turnOn() {
		if(status == true) {
			System.out.println("\n"+type+" is already turned on");
		}
		else {
			System.out.println("\n"+type+" is turned on");
		}
	}
	
//	Check for lightDevice and ThermostatDevice off
	public void turnOff() {
		if(status == true) {
			System.out.println("\n"+type+"is turned off");
		}
		else {
			System.out.println("\n"+type+"is already turned off");
		}
	}
	

	
}
//Design a SmartHomeDevice class with attributes like type, status, and control methods.
//
//
//
//1.Create a class SmartHomeDevice
//
//Instance variable:-
//
//String type,private
//
//boolean status,private
//
//
//
//Create a parameterized constructor for type variable to initialize the variable
//
////Device is initially turned off
//
//
//
//Generate Getters and setters for all Instance variable to get values and set values.
//
//
//
//Create an instance method turnOn() to turn on the device
//
////if status is false then change status to true and print "is turned on." 
//
////if status is true then print "is already turned on".
//
//
//
//
//
//Create an instance method turnOff() to turn off the device
//
////if status is true then change status to false and print "is turned off."
//
////if status is false then print "is already turned off".
//