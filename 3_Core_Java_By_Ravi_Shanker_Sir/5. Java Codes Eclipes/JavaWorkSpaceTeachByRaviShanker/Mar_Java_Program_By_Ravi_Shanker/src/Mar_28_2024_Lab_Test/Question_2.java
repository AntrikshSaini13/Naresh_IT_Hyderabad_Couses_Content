package Mar_28_2024_Lab_Test;

// Write a Java program provided converts temperature from Celsius to Fahrenheit using a lambda expression and the Function<T, R> interface. 
//
//It defines a function celsiusToFahrenheit that takes a temperature in Celsius as input and returns the equivalent temperature in Fahrenheit.
//
//
//
//Formula : Fahrenheit = Celsius * 9/5 + 32

import java.util.function.*;
import java.util.*;
public class Question_2 {
	public static void main(String[] args) {
		
		Function<Float,Float> fun1 = Celsius -> Celsius * 9/5 + 32;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  Celsius");
		int Celsius = sc.nextInt();
		
		System.out.println(fun1.apply((float) Celsius));

	
		sc.close();
	}
}

