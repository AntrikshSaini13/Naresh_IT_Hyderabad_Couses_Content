package jan_22_2023_Question_1; 

// BLC Parent class / Super Class
public class Circle{
	//Declare instance variables
	double radius;
	double area;
	
	//default constructor to assign radius value to 5 by default
	Circle(){
	    radius = 5;
	}
	
	//parameterized constructor to assign radius value dynamically
	Circle(double radius){
	    this.radius = radius;
	}
	
	//this method is used to calculate the area of a circle and returns
	public double getArea() {
        //apply the formula of Circle A=πr2
        if(radius <= 0){
            return -1;
        }
        else{
            area =3.14*radius*radius;
            // System.out.println(area);
		    return area;
        }
	}
	
}