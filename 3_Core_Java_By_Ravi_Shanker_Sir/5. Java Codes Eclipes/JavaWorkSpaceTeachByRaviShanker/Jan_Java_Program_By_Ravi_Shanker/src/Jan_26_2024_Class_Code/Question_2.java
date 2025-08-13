package Jan_26_2024_Class_Code;


class MethodOverloading{
	
	public  int MethodOverloading(int num1, int num2 ) {
		System.out.println("Sum of two number is : "+(num1+num2));
		return 0;
	}
	
	public void MethodOverloading(int num1, int num2, int num3 ) {
		System.out.println("Sum of two number is : "+(num1+num2+num3));
	}
	
	public void MethodOverloading(int num1, int num2, int num3, int num4 ) {
		System.out.println("Sum of two number is : "+(num1+num2+num3+num4));
	}
	
}

public class Question_2 {
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.MethodOverloading(12,230);
		m1.MethodOverloading(12,230,225);
		m1.MethodOverloading(12,230,25,36);
//		System.out.println(m1);
	}
}
