package Mar_06_2024_ClassCode;

import java.util.*;

public class Question_3 {
	public static void main(String[] args) {
		System.out.println("Enter the main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y : ");
		int y = sc.nextInt();
		try {					
			int result = x/y;
			System.out.println("Division is : "+result);
			System.out.println("End the Try Block");
		}
		catch(Exception e) {
			System.err.println("Inside the Catch Block ");
			System.out.println(e);
			System.out.println("End the Catch Block");
		}
		finally {
			System.out.println("Inside the Final Block");
			sc.close();
		}
		System.out.println("End the main method");
	}
}
