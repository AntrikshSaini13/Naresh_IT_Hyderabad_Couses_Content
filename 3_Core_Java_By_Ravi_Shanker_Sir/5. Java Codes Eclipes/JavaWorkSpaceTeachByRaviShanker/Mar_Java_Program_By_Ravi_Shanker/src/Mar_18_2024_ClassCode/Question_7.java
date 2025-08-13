package Mar_18_2024_ClassCode;
import java.io.*;

public class Question_7 {
	public static void main(String[] args) throws IOException{
		DataInputStream d = new DataInputStream(System.in); // working style like Scanner because of defore the Scanner we use the DataInputStream() 		
		System.out.println("Enter the Your Name : ");
		String name = d.readLine();
		System.out.println("Your name is : "+ name);
	}
}
