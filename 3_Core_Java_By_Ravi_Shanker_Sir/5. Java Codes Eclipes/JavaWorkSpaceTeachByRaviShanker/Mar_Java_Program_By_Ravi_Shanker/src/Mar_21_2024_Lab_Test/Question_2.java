package Mar_21_2024_Lab_Test;

import java.io.*;

public class Question_2 
{
	public static void main(String[] args) {
		File f1 = new File("E:\\13-FileHandlingConcept\\Student.txt");
		
		try{
			if(f1.exists()) {
				System.out.println("File or directory exists.");
			}
			else {
				System.out.println("File or directory does not exist.");
			}
			if(f1.createNewFile()) {
				System.out.println("File or directory Create.");
			}
			else {
				System.out.println("File or directory does not Create.");
			}
			if(f1.delete()) {
				System.out.println("File deleted successfully." );
			}
			else {
				System.out.println("Failed to delete the file");
			}
		}
		catch(Exception e) {
			e.printStackTrace();;
		}
	}

}
