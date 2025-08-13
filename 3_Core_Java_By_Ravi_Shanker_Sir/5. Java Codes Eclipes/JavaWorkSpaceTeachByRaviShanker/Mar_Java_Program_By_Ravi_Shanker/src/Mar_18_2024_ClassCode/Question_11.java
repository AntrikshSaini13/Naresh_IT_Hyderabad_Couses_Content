package Mar_18_2024_ClassCode;

import java.io.*;
import java.util.Scanner;

public class Question_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Your name : ");
		
		String name = bf.readLine();
//		String naam = sc.nextLine();
		
		
		System.out.print("Enter your Id : ");
		int id = Integer.valueOf(bf.readLine());
		
		System.out.print("Enter your Gender :");
		char gen = bf.readLine().charAt(0);
		
		System.out.print("Enter your salary : ");
		float sal = Float.valueOf(bf.readLine());
		System.out.println(name);
		System.out.println(gen);
		System.out.println(id);
		System.out.println(sal);
	}
}
