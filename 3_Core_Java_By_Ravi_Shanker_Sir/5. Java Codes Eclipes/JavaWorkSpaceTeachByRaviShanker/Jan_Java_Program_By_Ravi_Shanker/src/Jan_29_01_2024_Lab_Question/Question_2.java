package Jan_29_01_2024_Lab_Question;


//Program 02:
//------------
//Create a class to print the area of a square and a rectangle. The class has two 
//methods with the same name but different number of parameters. The method for printing 
//area of rectangle has two parameters which are length and breadth respetively while the 
//other method for printing area of square has one parameter which is side of square.
////
//Expected Output:
//Area of a Square = 5.289999999999999
//Area of a Rectangle = 7.589999999999999

class Area{
	private double length;
	private double breath;
	
//	here is Constructor
	public Area(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

//	getter and setter
	public double getLength() {
		return length;
	}

	public double getBreath() {
		return breath;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Area [length=" + length + ", breadth=" + breath + "]";
	}
	
//	here is method of area find
	public double area(double breath) {
		this.breath = breath;

		
		return breath*breath;
	}
	
	public double area( double length, double breath) {
		this.breath = breath;
		this.length = length;
		
		return length *breath;
	}
	
}

public class Question_2 {
	public static void main(String[] args) {
		Area a1 = new Area(0, 0);
		
		System.out.println(a1);

		System.out.println("\nArea of Square : "+a1.area(26.5));
		System.out.println(a1);
		
		System.out.println("\nArea of Rectangle : "+a1.area(26.5,52.2));	
		System.out.println(a1);
	}
}

//Output : 
//
//Area [length=0.0, breadth=0.0]
//
//Area of Square : 702.25
//Area [length=0.0, breadth=26.5]
//
//Area of Rectangle : 1383.3000000000002
//Area [length=26.5, breadth=52.2]
