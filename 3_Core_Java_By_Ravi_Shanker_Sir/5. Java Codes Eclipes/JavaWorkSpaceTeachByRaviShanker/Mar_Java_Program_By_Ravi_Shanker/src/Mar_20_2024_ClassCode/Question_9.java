package Mar_20_2024_ClassCode;

import java.io.*;

public class Question_9 {
	public static void main(String[] args) throws FileNotFoundException {
//		Input Stream 
		var fInput = new FileInputStream("E:\\\\13-FileHandlingConcept\\Four.txt");
		
//		buffered Input Stream 
		var bufferedInput = new BufferedInputStream(fInput);
		
		try(fInput; bufferedInput){
			int getData;
			while((getData = fInput.read()) != -1) {
				System.out.print((char)getData);
				
			}
		}
		catch (Exception e) {
				e.printStackTrace();
		}
	}
	
}