package Mar_20_2024_ClassCode;

import java.io.*;

public class Question_10 {
	public static void main(String[] args) throws IOException {
//		input Stream to read the data from file
		var fInput = new FileInputStream("E:\\13-FileHandlingConcept\\Four.txt");
		
//		Buffered Input Stream for will not miss the 
		var bufInput = new BufferedInputStream(fInput);
		
//		Output Stream to the write the data in file
		var fOutput = new FileOutputStream("E:\\13-FileHandlingConcept\\Five.txt");
		
//		Buffered Output Stream for will not miss the
		var bufOutput = new BufferedOutputStream(fOutput);
		
		try(fInput; bufInput; fOutput; bufOutput){
			int getDataFile;
//			       here we are read the data
			while((getDataFile = bufInput.read()) != -1) {
				System.out.print((char)getDataFile);
				
//				here we are the data in file
				bufOutput.write(getDataFile);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
