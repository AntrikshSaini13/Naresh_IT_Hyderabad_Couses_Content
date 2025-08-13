package jan_22_2023_Question_2;

//Child Class / Sub class
public class ThermostatDevice extends SmartHomeDevice {

//	parameter constructor
	public ThermostatDevice(String type) {
		super(type);
	}
	
//	method of dim light
	public void setTemperature(int temperature) {
		System.out.println("Thermostat temperature is set to " + temperature + "°C.\n");
	}
}

//3.Create another Subclass ThermostatDevice inheriting from SmartHomeDevice
//
//Create a parameterized constructor.
//
////Use super keyword to initialize SmartHomeDevice class constructor attributes.
//
//
//
//Create an instance method setTemperature() with parameter temperature type integer.
//
////print "Thermostat temperature is set to " + temperature + "°C."
//
//