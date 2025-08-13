package Mar_20_2024_ClassCode;


//Proram to read the data from two files at the same time

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class Question_6 {
	public static void main(String[] args) throws FileNotFoundException {
		var fip1 = new FileInputStream("E:\\13-FileHandlingConcept\\one.txt");
		var fip2 = new FileInputStream("E:\\13-FileHandlingConcept\\two.txt");
		
		var s = new SequenceInputStream(fip1, fip2);
		
		try(fip1; fip2; s){
			while(true) {
				int charUnicode = s.read();
				if(charUnicode == -1) {
					break;
				}
				System.out.print((char)charUnicode);
			}			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
