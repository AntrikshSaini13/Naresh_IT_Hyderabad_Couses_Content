package Feb_02_2024_Class_Code;


class Shape
{
	public void draw()
	{
		System.out.println("Generic Draw");
	}
}
class Rectangle extends Shape
{
	@Override
	protected void draw()  //error only public is applicable
	{
		System.out.println("Drawing Rectangle");
	}
}
class Square extends Shape
{
	@Override
	protected void draw()
	{
		System.out.println("Drawing Square");
	}
}
public class Question_3 
{
	public static void main(String[] args) 
	{
		Shape s = null;
		
		s = new Rectangle(); s.draw();
		s = new Square(); s.draw();
	}

}
