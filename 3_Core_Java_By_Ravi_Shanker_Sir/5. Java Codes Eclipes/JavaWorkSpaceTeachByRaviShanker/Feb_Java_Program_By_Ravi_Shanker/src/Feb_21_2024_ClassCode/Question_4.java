package Feb_21_2024_ClassCode;

// here is Function  functional interface is here  this is  take input as well as return the data

import java.util.function.*;
import java.util.*;

public class Question_4 {
	public static void main(String[] args) {
		// find the Length of the Name
		
		Function <String, Integer> fun1 = str->str.length();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = sc.next();
		
		System.out.println("The Length of Name is : "+fun1.apply(name));
		sc.close();
	}
}
