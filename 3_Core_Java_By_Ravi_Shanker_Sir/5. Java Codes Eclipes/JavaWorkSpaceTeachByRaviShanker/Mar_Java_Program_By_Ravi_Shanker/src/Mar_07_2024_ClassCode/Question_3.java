package Mar_07_2024_ClassCode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
		System.out.println("Started main Method");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Start Try Block here");
			System.out.println("Enter the Roll Number : ");
			int roll = sc.nextInt();
			System.out.println("Your Roll number is : "+roll);
		}
		catch(InputMismatchException e) {
			System.out.println("Input is Not proper format");
		}
		sc.close();
		System.out.println("Main method is Ended");
	}
}
