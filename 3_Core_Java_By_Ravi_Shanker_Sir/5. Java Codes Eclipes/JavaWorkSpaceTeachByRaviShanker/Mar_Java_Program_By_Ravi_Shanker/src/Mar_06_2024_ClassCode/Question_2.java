package Mar_06_2024_ClassCode;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args)
	{
		System.out.println("Main method started..");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x :");
		int x = sc.nextInt();
		
		System.out.print("Enter the value of y :");
		int y = sc.nextInt();
		
		int res = x/y; //[if y value is 0 then program will halt]
		System.out.println("Result is :"+res);
		
		System.out.println("Main method ended..");
		sc.close();
	}

}
