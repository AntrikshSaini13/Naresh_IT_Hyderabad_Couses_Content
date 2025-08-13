package Feb_13_2024_ClassCode;

abstract class Shape 
{
  protected int x;
  
  public Shape(int x)
  {
	  this.x = x;
  }
	
  public abstract void area();
}


class Rectangle extends Shape
{
	protected int breadth;
	public Rectangle(int l, int b)
	{
		super(l);
		breadth = b;
	}

	@Override
	public void area() 
	{
		double area = x * breadth;
		System.out.println("Area of Rectangle is :"+area);
		
	}
}

class Square extends Shape
{
	public Square(int side) 
	{
		super(side);		
	}
	
	@Override
	public void area() 
	{
		double area = x * x;
		System.out.println("Area of Square is :"+area);
		
	}

}

class Circle extends Shape
{
    final double  PI = 3.14;
	public Circle(int radius)
	{
		super(radius);
	}
	
	@Override
	public void area() 
	{
		double area = PI * x*x;
		System.out.println("Area of Circle is :"+area);
		
	}
}


public class Question_5 
{
   public static void main(String[] args) 
   {
	  Shape s = null;
	  
	  s = new Rectangle(5, 9); s.area();
	  
	  s = new Square(40); s.area();
	  
	  s = new Circle(9); s.area();
   }
}