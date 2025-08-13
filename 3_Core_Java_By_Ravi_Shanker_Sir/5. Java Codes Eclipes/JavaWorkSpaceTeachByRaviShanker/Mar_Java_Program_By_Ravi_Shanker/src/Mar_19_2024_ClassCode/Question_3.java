package Mar_19_2024_ClassCode;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;

public class Question_3 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Here we are only write the data with 'FileOutputStream' and reference of 'fout.write(array)' writing the data inside the data");
		
//		File f1 = new File("E:\\13-FileHandlingConcept\\Collage.txt");
		
		FileOutputStream fout = new FileOutputStream("E:\\13-FileHandlingConcept\\one.txt");// this stream mainly use for provide the path for write the and send the data
		
		try(fout){
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));// this is internally store the data in buffer and read the data before the scanner
			
			System.out.println("Enter the data ");
			String str = bf.readLine();// store the data int string 
//			String str = "My name Antriksh Saini";
			
			byte [] array = str.getBytes();//this string convert into UNICODE
			
			for(byte arr : array) {
				System.out.println(arr);
			}
			
			fout.write(array);// here we are store the data in file with help of write() method and 'fout' is reference of fileOutput stream its provide the file path only 
			System.out.println("\nSuccess....");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
