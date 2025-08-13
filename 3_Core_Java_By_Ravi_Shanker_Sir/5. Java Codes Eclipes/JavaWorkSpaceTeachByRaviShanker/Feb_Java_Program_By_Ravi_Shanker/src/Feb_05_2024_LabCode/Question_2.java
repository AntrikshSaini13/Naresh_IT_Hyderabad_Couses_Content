package Feb_05_2024_LabCode;

//  Shape is Supper class
class Shape{
	
//	Constructor
	public Shape() {
		System.out.println("Constarctor1");
	}
	
//	Method
	public static Shape randshape() {
		
		switch((int)Math.random()*3) {
		
			case 0 : return new Circle();
			         
			case 1 : return new Square();
					 
			case 2 : return new Triangle();

			default : System.out.println("No Any Object herre");
			
		}	
		System.out.println("randSahape");
		return new Shape();
	}
	public void draw(){
		System.out.println("draw :");
	}
	
	public void erase(){
		System.out.println("erase:");
	}
}

// sub classes Circle
class Circle extends Shape{
	
	@Override
	public void draw(){
		System.out.println("Circle draw :");
//		System.out.println((int)Math.random()*3);
	}
	@Override
	public void erase(){
		System.out.println("Circle erase:");
	}
}

// sub classes Triangle
class Triangle extends Shape{
	
	@Override
	public void draw(){
		System.out.println("Triangle draw :");
	}
	@Override
	public void erase(){
		System.out.println("Triangle erase:");
	}
}

// sub classes Square
class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("Square draw :");
	}
	@Override
	public void erase(){
		System.out.println("Square erase:");
	}
}

public class Question_2 {
	public static void main(String[] args) {
		
		
		Shape s1 = new Shape();
		System.out.println(s1);
		 
		Shape s = Shape.randshape();
		System.out.println(s);
		s.draw();
		s.erase();
	}
}

//Output : Constarctor1
//Feb_05_2024_LabCode.Shape@372f7a8d
//Constarctor1
//Feb_05_2024_LabCode.Circle@1f32e575
