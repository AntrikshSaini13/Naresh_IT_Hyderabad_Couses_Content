package Mar_20_2024_ClassCode;

//Program to write the data on multiple files.

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.InputMap;

public class Question_4 {
	public static void main(String[] args) throws FileNotFoundException {
//		Input Stream
		var fin = new FileInputStream("E:\\13-FileHandlingConcept\\hyd.txt");
//		Output Stream
		var fop1 = new FileOutputStream("E:\\13-FileHandlingConcept\\one.txt");
		var fop2 = new FileOutputStream("E:\\13-FileHandlingConcept\\two.txt");
		var fop3 = new FileOutputStream("E:\\13-FileHandlingConcept\\three.txt");
//		Byte Output Stream
		var byteop = new ByteArrayOutputStream();
		
		try(fin; fop1; fop2; byteop){
			while(true) {
				int getUnicode = fin.read();
				if(getUnicode == -1) {
					break;
				}
				System.out.print((char)getUnicode);
				byteop.write((byte)getUnicode);
			}
			byteop.writeTo(fop1);
			byteop.writeTo(fop2);
			byteop.writeTo(fop3);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
