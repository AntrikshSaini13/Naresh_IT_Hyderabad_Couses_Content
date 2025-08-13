package Task_0;

//Q1) Write a program to perform addition,subtraction, multiplication and 
//division between two numbers using 3rd variable

// Note : Java Converting Primitive data type to Wrapper Class 

public class Question_1 {

	public static void main(String[] args) {
		
//		This concept of writing (Java-1.4)
		Integer obj1 = Integer.valueOf(5);
		
		double obj2 = Double.valueOf(6);
		
		Double obj3 = obj1 +obj2;
				
		System.out.println("Sum of two Number is : "+obj3);
//		
		Double obj4 = obj1 - obj2;
		
		System.out.println("Subtraction of two number is : "+obj4);
		
		Double obj5 = obj1 * obj2;
		
		System.out.println("Multiplication of two Number is : "+obj5);
//		
		Double obj6 = obj1 / (obj2);
		
		System.out.println("Division of two number is : "+obj6);
		
		
//		Primitive data type
		int num1 = 25;
		float num2 = 2;
		
		float num3 = num1 + num2;
		System.out.println(num3);
		
		float num4 = num1 - num2 ;
		System.out.println(num4);
		
		float num5 = num1 * num2 ;
		System.out.println(num5);
		
		double num6 = num1/num2;
		System.out.println(num6);
	}
	
}
