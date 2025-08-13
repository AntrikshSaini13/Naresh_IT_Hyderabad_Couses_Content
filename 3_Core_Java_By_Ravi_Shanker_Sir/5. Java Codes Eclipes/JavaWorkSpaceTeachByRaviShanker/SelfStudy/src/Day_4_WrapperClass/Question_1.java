package Day_4_WrapperClass;

public class Question_1 {
	public static void main(String[] args) {
		
//		here we are wrapper class convert into primitive data type
		int x = Integer.parseInt("111",2);
		System.out.println("Value of x : "+x);
		
//		here primitive data type convert into Wrapper Class
		Integer obj1 = Integer.valueOf("111",2);
		
//		'intValue' only convert type of data 
		int a = obj1.intValue();
		
		System.out.println("Value of a = "+a);
		
		Double obj2 = Double.valueOf(25.3);
		
//		'doubleValue' this one only converting type of data 
		double b = obj2.doubleValue();
		
		System.out.println("Value of b : "+b);
		
	}
}
