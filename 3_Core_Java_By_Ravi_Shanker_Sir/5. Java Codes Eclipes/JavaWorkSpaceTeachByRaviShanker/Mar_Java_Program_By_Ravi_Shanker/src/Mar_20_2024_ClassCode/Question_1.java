package Mar_20_2024_ClassCode;

//Reading tha data from the file
import java.io.*;
public class Question_1
{
	public static void main(String[] args) throws FileNotFoundException {
//		here writing the input stream 
		FileInputStream fip = new FileInputStream("E:\\13-FileHandlingConcept\\aman.txt");// FileInputStream is checked Exception
		try(fip){
			
			while(true) {
				int charOfUnicode = fip.read();
				if(charOfUnicode == -1) {
					break;
				}
				System.out.print((char)charOfUnicode);
			}
		}
		catch(Exception e) {
			
		}
	}
}

