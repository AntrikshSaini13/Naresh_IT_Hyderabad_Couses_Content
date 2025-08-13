package jan_22_2023_Question_2;

import java.util.*;

// Mian' Class
public class MainSmart {
	public static void main(String[] args) {
		
		//here creating the object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//I am Creating a object of class LeightDevice
		LightDevice l1 = new LightDevice("Light");
       
//		Insert The Value is User
		System.out.println("Check the light on or off enter the 'true' and 'false'");
		boolean light = sc.nextBoolean();
		
		System.out.println("Enter the light brightness percentage");
		int brightness = sc.nextInt();
		
		l1.setStatus(light);
		l1.turnOn();
		l1.dim(brightness);
		
		 //I am Creating a object of class ThermostatDevice
		ThermostatDevice t1 = new ThermostatDevice("Thermostat");
		
		//		Insert The Value is User
		System.out.println("Check Acc on or off enter the 'true' and 'false'");
		boolean Thermostat = sc.nextBoolean();
		
		System.out.println("Enter the temperature of room");
		int temperature = sc.nextInt();
		
		t1.setStatus(Thermostat);
		t1.turnOn();
		t1.setTemperature(temperature);
		
		l1.turnOff();
		t1.turnOff();
		sc.close();
	}
}
		
		

//
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
//// Device is initially turned off
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
//
//
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
//
//
//
//
//
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
//
//4.Create a class MainSmart which contains main method to demonstrate the usage.
//
////Creating a LightDevice object to call the methods.
//
////Creating a ThermostatDevice object to call the methods.
//
//
//
//Output:-
//
//Light is turned on.
//
//Light brightness is set to 50%.
//
//Thermostat is turned on.
//
//Thermostat temperature is set to 22°C.
//
//Light is turned off.
//
//Thermostat is turned off.
//
//
//
//
