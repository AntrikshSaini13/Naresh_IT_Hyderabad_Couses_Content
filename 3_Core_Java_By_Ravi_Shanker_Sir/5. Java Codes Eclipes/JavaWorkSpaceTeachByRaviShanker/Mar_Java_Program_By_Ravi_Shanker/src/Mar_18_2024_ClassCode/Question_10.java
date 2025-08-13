package Mar_18_2024_ClassCode;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;
public class Question_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
		var br =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your Gender : ");
		char gen = (char) br.read();
		
		System.out.println("Your Gender is : "+ gen);
	}
}
