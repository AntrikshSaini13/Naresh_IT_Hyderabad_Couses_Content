package Apr_04_2024_Lab_Test;

//Design a Java program to simulate an aquarium system with multithreading capabilities. 

//Devlop an Aquarium class with attributes for capacity and currentVolume.

//Provide a constructor accepting the initial capacity and setting the current volume to 0.

//Define a FillingThread class implementing the Runnable interface.
//
//Create a constructor accepting an Aquarium object and the amount of water to fill.
//
//Implement the run() method to call the fill() method of the provided Aquarium object to 
//fill the aquarium with the specified amount.

//Take a Test class In the main method, instantiate an Aquarium with a capacity of 100 liters.
//
//Create two threads, thread1 and thread2, initialized with instances of FillingThread and the 
//same Aquarium object.
//
//Start both threads using the start() method.

class Aquarium{
//	Instance
	private int currentVolume = 0;//5
//  Constructor
	public Aquarium(int currentVolume) {
		super();
		this.currentVolume = currentVolume;
	}
//  Getter
	public int getCurrentVolume() {
		return currentVolume;
	}
//  Setter
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	@Override
	public String toString() {
		return "Aquarium [currentVolume=" + currentVolume + "]";
	}	
}

class FillingThread implements Runnable{
	
	private Aquarium aquarium;
	private int water ;
	
	public FillingThread() {
		super();
	}
	
	public FillingThread(Aquarium aquarium, int water) {
		super();
		this.aquarium = aquarium;
		this.water = water;
	}
	public void fill() {		
		System.out.println("Water Level is : "+water+" "+aquarium );
	}
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
		fill();
	}	
}


public class Question_4 {
	public static void main(String[] args) {
		Aquarium a = new Aquarium(5);	
		
		FillingThread fT = new FillingThread(a,4);
		
		Thread t1 = new Thread(fT,"Child1"); 
		Thread t2 = new Thread(fT,"Child2"); 
		
		t1.start(); 
		t2.start();	
	}
}
