package jan_22_2023_Question_1;

// BlC Cylinder is a subclass of Circle
public class Cylinder extends Circle{
	//Declare instance variables
	double height;
  // V=πr2h
	//default constructor to assign height value to 5 by default
	Cylinder(){
	    height = 5;
	}
	
	
	//parameterized constructor to assign radius and height values dynamically
	Cylinder(double radius , double height){
		//call super class's parameterized constructor by passing required values
		super(radius);
		this.height = height;
//		System.out.println(height);
	}
	
	//this method calculates and returns volume of Cylinder
	public double getVolume() {
		
		if(height <=0){
		    return -1;
		}
		else{
		    double volume =area*height;
		    return volume;
		}
//		return 0;
	}
}
