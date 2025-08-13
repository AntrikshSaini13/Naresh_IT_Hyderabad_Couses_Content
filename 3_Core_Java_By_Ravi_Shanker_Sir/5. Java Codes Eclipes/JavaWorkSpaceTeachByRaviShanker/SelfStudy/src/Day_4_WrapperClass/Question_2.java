package Day_4_WrapperClass;

public class Question_2 {
	public static void main(String[] args) {
		
//		here we are wrapper class convert into int data type
		int x = Integer.parseInt("111",2);
		System.out.println("Value of x : "+x);
		
//		"Java-4.1" we went to write convert primitive data to wrapper class
		
//		here Primitive data type convert into Wrapper Class
		Integer obj1 = Integer.valueOf("111",2);		
		System.out.println("Value of a = "+obj1);
		
		Double obj2 = Double.valueOf(25);
		System.out.println("Value of b : "+obj2);
		
	}
}
