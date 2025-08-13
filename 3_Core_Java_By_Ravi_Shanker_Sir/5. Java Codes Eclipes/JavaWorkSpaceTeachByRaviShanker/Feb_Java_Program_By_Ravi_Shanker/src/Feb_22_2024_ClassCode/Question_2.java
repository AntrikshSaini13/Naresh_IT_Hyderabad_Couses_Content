package Feb_22_2024_ClassCode;

//BiPrediacte Functional interface we enters two parameter and return only boolean

import java.util.function.*;
import java.util.*;
public class Question_2 {
	public static void main(String[] args) {
		BiPredicate <Integer, Integer> bipre = (a,b)-> (a+b)%2==0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Two Number");
		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		
		if(bipre.test(num1, num2)) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		sc.close();
	}
}
