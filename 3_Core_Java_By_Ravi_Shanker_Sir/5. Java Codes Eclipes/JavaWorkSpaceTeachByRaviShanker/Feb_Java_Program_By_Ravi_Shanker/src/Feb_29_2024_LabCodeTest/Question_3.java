package Feb_29_2024_LabCodeTest;
import java.util.*;
@FunctionalInterface
interface Calculator{
	public abstract void Calculate(int num1,float num2);
}

public class Question_3 {
	public static void main(String[] args) {
//		here is Lambda Expression
		Calculator sum = (num1, num2) -> System.out.println("Sum is : "+(num1+num2));
		Calculator sub = (num1, num2) -> System.out.println("sub is : "+(num1-num2));
		Calculator mul = (num1, num2) -> System.out.println("mul is : "+(num1*num2));
		Calculator div = (num1, num2) -> System.out.println("div is : "+(num1/num2));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the two number : ");
		int num1 = sc.nextInt();
		float num2 = sc.nextInt();
		
		sum.Calculate(num1, num2);
		
		sub.Calculate(num1, num2);
		
		mul.Calculate(num1, num2);
		
		div.Calculate(num1, num2);
		
		sc.close();
	}
}

