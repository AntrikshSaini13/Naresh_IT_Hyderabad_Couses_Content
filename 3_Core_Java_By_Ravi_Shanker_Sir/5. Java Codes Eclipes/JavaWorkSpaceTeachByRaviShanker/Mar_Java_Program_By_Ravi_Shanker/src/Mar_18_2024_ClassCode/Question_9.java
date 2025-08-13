package Mar_18_2024_ClassCode;

import java.io.*;

public class Question_9 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Salary : ");
		
		String sal = bf.readLine();
		
		// here apply Converting String to Integer
		float salary = Float.valueOf(sal);
		
		System.out.println("My salary is : "+ salary);		
	}
}
