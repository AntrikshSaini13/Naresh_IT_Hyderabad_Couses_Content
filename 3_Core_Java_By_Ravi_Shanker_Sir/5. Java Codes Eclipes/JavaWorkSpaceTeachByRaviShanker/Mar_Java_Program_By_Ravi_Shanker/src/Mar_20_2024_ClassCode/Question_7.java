package Mar_20_2024_ClassCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

//Reading the data from two files and writing the data to a single file
public class Question_7 {
	public static void main(String[] args) throws FileNotFoundException {
//		input Stream
		var fip1 = new FileInputStream("E:\\13-FileHandlingConcept\\one.txt");
		var fip2 = new FileInputStream("E:\\13-FileHandlingConcept\\one.txt");
//		Output Stream
		var fop = new FileOutputStream("E:\\13-FileHandlingConcept\\three.txt");
		
//		put the both file reference in Sequence Stream
		var sq = new SequenceInputStream(fip1, fip2);
		
		try(fip1; fip2; fop ;sq){
			int i;
			while(true) {
				i = sq.read();
				if(i == -1) {
					break;
				}
				System.out.print((char)i);
				fop.write((byte)i);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
