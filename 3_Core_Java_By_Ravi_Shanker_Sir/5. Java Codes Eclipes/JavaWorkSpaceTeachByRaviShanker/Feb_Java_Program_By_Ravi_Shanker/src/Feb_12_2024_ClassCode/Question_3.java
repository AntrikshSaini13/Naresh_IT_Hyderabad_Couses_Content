package Feb_12_2024_ClassCode;


// abstract class inside abstract method
abstract class AbstarctClass{
	public abstract void Father();
}

class Sub extends AbstarctClass{
	@Override
	public void Father() {
		System.out.println("Hello");
	}
}

public class Question_3 {
	public static void main(String[] args) {
		
		//Gernal Object
		Sub s1 = new Sub();
		s1.Father();
		
		//Up Casting
		AbstarctClass a1;
		a1 = new Sub();
		a1.Father();
		
		//Super class Object
//		AbstarctClass a2 = new AbstarctClass();//Error
//		a2.Father();
		
		//Down Casting
//		Sub a2 = (Sub) new AbstarctClass();//Error
//		a2.Father();
		
	}
}
