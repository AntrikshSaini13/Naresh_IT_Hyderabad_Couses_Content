package Mar_18_2024_ClassCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_13 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the two number : ");
		int num1 =Integer.valueOf(bf.readLine());
		int num2 =Integer.valueOf(bf.readLine());
		
		int sum = num1+num2;
		System.out.println("Sum is : "+ sum);
		
	}
}
