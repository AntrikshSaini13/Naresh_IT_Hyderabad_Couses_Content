package Mar_20_2024_ClassCode;

import java.io.*;

// read the image of the one file and write the three different file

public class Question_5 {
	public static void main(String[] args) throws IOException { 
//		InputStream Read to file
		var fInput = new FileInputStream("E:\\13-FileHandlingConcept\\advit.JPG");
//		OutputStream Write to file
		var fOutput1 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\Image1.txt");
		var fOutput2 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\Image2.txt");
		var fOutput3 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\Image3.txt");
		
//		ByteArrayOutputStream
		var byteOutput = new ByteArrayOutputStream();
		
		try(fInput; fOutput1; fOutput2; fOutput3; byteOutput){
			int imageData ;
//			read the the data to file
			while((imageData = fInput.read())!=-1) {
				System.out.print((char)imageData);
//				write the data to the 
				byteOutput.write(imageData);
			}
			byteOutput.writeTo(fOutput1);
			byteOutput.writeTo(fOutput2);
			byteOutput.writeTo(fOutput2);
		}
		
		
	}
}
