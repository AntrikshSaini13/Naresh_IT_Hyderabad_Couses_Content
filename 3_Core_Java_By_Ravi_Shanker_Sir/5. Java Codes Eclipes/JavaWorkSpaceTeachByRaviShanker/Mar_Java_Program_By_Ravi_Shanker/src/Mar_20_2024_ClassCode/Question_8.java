package Mar_20_2024_ClassCode;

import java.io.*;

public class Question_8 {
	public static void main(String[] args) throws IOException{
//		output Stream For write the file data
		var fOutput = new FileOutputStream("E:\\13-FileHandlingConcept\\Buffer.txt");
		
//		Buffered Output stream for willn't miss the data in the buffer
		var bOutput = new BufferedOutputStream(fOutput);
		
//		BufferedReader and InputStreamReader
		var bReader = new BufferedReader(new InputStreamReader(System.in));
		
		try(fOutput; bOutput; bReader){
			System.out.println("Enter our detals our self");
			String str = bReader.readLine();
			
			byte [] araay = str.getBytes();
			
			fOutput.write(araay);
		}
		
	}
}
