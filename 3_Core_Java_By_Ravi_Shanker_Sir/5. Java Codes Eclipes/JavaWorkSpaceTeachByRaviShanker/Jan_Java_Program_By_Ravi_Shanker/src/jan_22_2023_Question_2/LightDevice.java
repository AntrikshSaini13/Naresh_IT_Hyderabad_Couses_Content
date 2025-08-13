package jan_22_2023_Question_2;

//Child Class / Sub class
public class LightDevice extends SmartHomeDevice {
	
//	parameter constructor
	public LightDevice(String type) {
		super(type);
	}
	
//	method of dim light
	public void dim(int brigtness) {
		System.out.println("Light brightness is set to " +brigtness+ "%.\n");
	}
}
//2. Create a Subclass LightDevice inheriting from SmartHomeDevice
//
//Create a parameterized constructor.
//
////Use super keyword to initialize SmartHomeDevice class constructor attributes.
//
//
//
//Create an instance method dim() with parameter brightness type integer.
//
////print "Light brightness is set to " + brightness + "%."