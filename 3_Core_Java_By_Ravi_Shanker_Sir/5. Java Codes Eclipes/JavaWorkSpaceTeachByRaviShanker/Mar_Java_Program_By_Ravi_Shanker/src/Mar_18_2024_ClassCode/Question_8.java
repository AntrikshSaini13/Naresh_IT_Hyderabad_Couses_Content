package Mar_18_2024_ClassCode;

import java.io.*;

public class Question_8 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new  InputStreamReader(System.in));// this apply for read stored data
		
		try {
			System.out.println("Enter your Age");
			String age = bf.readLine(); // here is give the error without IOException
			
			// here apply Converting String to Integer			
			int age1 = Integer.valueOf(age); // we can use the Integer.parseInt(age)
			if(age1>18) {
				System.out.println("Go for a moive");
			}
			else {
				System.out.println("You are Minnor");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}		
	}
}
