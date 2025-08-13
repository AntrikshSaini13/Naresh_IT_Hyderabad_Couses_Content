package Jan_26_2024_Class_Code;

//Constructor Overloading

class ConstructOverloading{
	int num1;
	int num2;
	int num3;
	int num4;
	
	public ConstructOverloading(int num1, int num2 ) {
		System.out.println("Sum of two number is : "+(num1+num2));
	}
	
	public ConstructOverloading(int num1, int num2, int num3 ) {
		System.out.println("Sum of two number is : "+(num1+num2+num3));
	}
	
	public ConstructOverloading(int num1, int num2, int num3, int num4 ) {
		System.out.println("Sum of two number is : "+(num1+num2+num3+num4));
	}

	@Override
	public String toString() {
		return "constructOverloading [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + "]";
	}	
}

public class Question_1 {
	public static void main(String[] args) {
		ConstructOverloading c1 = new ConstructOverloading(1,2);
		ConstructOverloading c2 = new ConstructOverloading(1,2,3);
		ConstructOverloading c3 = new ConstructOverloading(1,2,4,5);
		
		System.out.println(c1+"\n"+c2+"\n"+c3);
	}
}
