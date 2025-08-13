package Mar_19_2024_Lab_Task;

import java.io.*;

public class Question_1
{
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\13-FileHandlingConcept\\aman.txt");
		
		System.out.println(file.exists()); // here we can check  file is available or not this want to full path of file
		
		System.out.println(file.canRead());//here is file available or not that means check the file path direction here and return true or false
		
		System.out.println(file.canExecute()); // her always check the file path only is available or not
		
		System.out.println(file.isFile()); // here is check the file ".txt" is available or not if it is not available gives the false otherwise true
		
		System.out.println(file.getAbsolutePath()); // this line gives the full path of file like that "E:\13-FileHandlingConcept\aman.txt"
		
		System.out.println(file.getName());  // this is only give the ".txt" file name only.
		
		System.out.println(file.createNewFile()); // this is create ".text" file and then after gives the true when its create if already avaliable its give the false 

		System.out.println(file.getParent()); // this is gives only path of file only 
	
		System.out.println(file.getPath());  // this line gives the full path of file like that "E:\13-FileHandlingConcept\aman.txt"
		
//		System.out.println(file.getFD());
		System.out.println(System.in.read()); //It return first ascii value
//		System.out.println(file.); //It return first ascii value
	}
}