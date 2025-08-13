package Mar_20_2024_ClassCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Question_2 {
	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("E:\\13-FileHandlingConcept\\Hyderabad.txt");
		var fip = new FileInputStream("E:\\13-FileHandlingConcept\\one.txt");//this is giving stream of file path reference and that reference we can read the data to file
		var fop = new FileOutputStream("E:\\13-FileHandlingConcept\\Hyderabad.txt");//this is giving the stream of file path reference and that reference we can write the data to file
		try(fip ; fop ;){
			while(true) {
				int charUnicode = fip.read();
				if(charUnicode == -1) {
					break;
				}
				System.out.print((char)(charUnicode));
				fop.write(charUnicode);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(f1.delete());// this line delete the file of folder
	}
}
