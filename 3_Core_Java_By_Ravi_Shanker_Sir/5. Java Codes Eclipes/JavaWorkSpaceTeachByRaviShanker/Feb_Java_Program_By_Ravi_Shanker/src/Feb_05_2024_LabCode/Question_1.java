package Feb_05_2024_LabCode;

//Super Class GeometricShape
class GeometricShape{
//	Instance Variable
	String shapeType;
	double area;
	
//	Parameterized Constructor
	public double computeArea(double value1, double value2) {
		this.area = value1 * value2;
		return area ;
	}
	
//	Method show the Data
	public void show() {
		System.out.println("Gemotraci Shape :"+shapeType+"Area : "+area);
	}
}

//Sub Class Rectangle of GeometricShape
class Rectangle extends GeometricShape{
	
//	instance method of rectangle Class
	double width;
	double length;
	
//	constructor
	public Rectangle(){
		this.width = 10;
		this.length = 10;
	}

//	getter and setter method
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}
//	method override here of compute sub  class of rectangle with GeometricShape super class
	@Override
	public double computeArea(double value1, double value2) {
		this.length=value1;
		this.width=value2;
		super.area =value1*value2;
		return area;
	}
	
	
	public double computeArea() {		 
		super.area =width*length;
		return area;
	}
	
	@Override
	public void show() {
		System.out.println(shapeType+" length : "+ length +" width : "+width+" Area : "+area);
	}
}

//Cube class is a sub class of Rectangle
class Cuboid extends Rectangle{
	
	private double height ;
	
	
	
	public Cuboid() {
		this.height = 15;
	}

//	getter seter 
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
//	methdo
	public double computeArea(double width, double length, double height) {
		this.height = height;
		super.length = length;
		super.width = width;
		 
		super.area=2*(width*length + length * height + height*width);
		
		return area;
	}
	
	@Override
	public double computeArea() {		 
		super.area=2*(width*length + length * height + height*width);
		return area;
	}
	
	@Override
	public void show() {
		System.out.println(shapeType+" length : "+ length +" width : "+width+" Height : "+height+" Area : "+area);
	}
}

//ELC Class
public class Question_1 {
	public static void main(String[] args) {
		
		GeometricShape g1;
		
		g1 =new Rectangle();
		System.out.println("Area Of Rectangle is : "+g1.computeArea(10, 20));
		g1.shapeType ="REctangle";
		g1.computeArea(25, 26);
		g1.show();
		
		Rectangle r1;
		r1 = new Cuboid();
		r1.setLength(25);
		r1.setWidth(15);
		r1.shapeType ="Coboid";
		r1.computeArea();
		r1.show();
		
		
//		Cuboid c1 = new Cuboid();
//		System.out.println("Area of Cuboid : "+c1.computeArea(10, 20, 30));
//		c1.show();	
//		
//		
//		c1.setHeight(25);c1.setLength(15);c1.setWidth(10);
//		c1.computeArea(0, 0, 0);
//		c1.show();
		
	}
}

