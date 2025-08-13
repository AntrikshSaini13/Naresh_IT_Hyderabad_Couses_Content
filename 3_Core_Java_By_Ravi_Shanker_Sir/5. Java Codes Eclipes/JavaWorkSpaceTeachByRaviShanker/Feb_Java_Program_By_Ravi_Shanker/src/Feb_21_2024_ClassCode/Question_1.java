package Feb_21_2024_ClassCode;

//  predicate interface Function 

import java.util.function.*;
import java.util.*;

public class Question_1 {
	public static void main(String[] args) {
		
		//verify weather the name start with R or not
	//class name	  return type	// lambda Expression overridden the predicate interface its a predefine abstract method			
		Predicate <String> name = str -> str.startsWith("R");//lambda implicitly return type
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name");
		
		String name1 = sc.next();
		
		System.out.println();
		
		//      calling is here
		if(name.test(name1)) {
			System.out.println("The name is Start with R");
		}
		else {
			System.out.println("The name is not Start with R");
		}
		sc.close();
	}
}
