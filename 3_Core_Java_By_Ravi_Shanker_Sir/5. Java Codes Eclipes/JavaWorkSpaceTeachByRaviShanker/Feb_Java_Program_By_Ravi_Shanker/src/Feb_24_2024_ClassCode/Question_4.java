package Feb_24_2024_ClassCode;

interface Drawable{
	public abstract void draw();
}

class Draw extends Object implements Drawable{

	@Override
	public void draw() {
		System.out.println("Sub Class Override ");		
	}	
}

public class Question_4 {
	public static void main(String[] args) {
		Draw d1 = new Draw();
		Draw d2 = new Draw();
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
		System.out.println(d1.equals(d2));
				
		Drawable d3 = new Draw();
		Drawable d4 = new Draw();
		
		System.out.println(d3.hashCode());
		System.out.println(d2.hashCode());
		
		System.out.println(d3.equals(d4));
	}
}
