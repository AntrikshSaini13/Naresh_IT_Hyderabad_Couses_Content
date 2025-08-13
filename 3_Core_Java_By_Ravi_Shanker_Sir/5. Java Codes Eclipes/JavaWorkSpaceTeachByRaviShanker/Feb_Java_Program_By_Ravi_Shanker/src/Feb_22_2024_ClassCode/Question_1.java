package Feb_22_2024_ClassCode;

//BiPrediacte Functional interface we enters two parameter and return only boolean

import java.util.function.*;

public class Question_1 {
	public static void main(String[] args) {
		BiPredicate <String,Integer> bipre = (a,b)->a.length()==b;
		
		System.out.println(bipre.test("Aman",4));
		
	}	
}
