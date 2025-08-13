package jan_22_2023_Question_1;


//ELC method to test our code
public class Circle_Cylinder_Main {

	public static void main(String[] args) {
		//create an object to Cylinder class. don't pass values.
		Cylinder c1 = new Cylinder();
		
		//call getVolume and getArea methods and print details
	    double area1 = c1.getArea();
		double volume1 = c1.getVolume();
		System.out.println("Area of Circle = "+area1);
		System.out.println("Volume Cylinder = "+volume1);
		
		//create an object to Cylinder class by passing values like (6,12)
		Cylinder c2 = new Cylinder(6,12);
		
		//call getVolume and getArea methods and print details
			double area2 = c2.getArea();
		    double volume2 = c2.getVolume();
		    System.out.println("Area of Circle = "+area2);
		    System.out.println("Volume of Cylinder = "+volume2);
		
//		Circle c2 = new Circle(1000);
//		System.out.println(c2.getArea());;
	}
		

}