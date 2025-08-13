package Mar_20_2024_Lab_Task;

import java.io.*;

public class Question_3 {
	public static void main(String[] args) throws IOException {
//		OutputStream for write the data to file-a,b,c
		var foutp1 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\a.txt");
		var foutp2 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\b.txt");
		var foutp3 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\c.txt");
//		this file for write the data own 
		var foutp4 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\student.txt");
		
//		Byte Output Stream for file data print three different file a,b,c
		var byteop = new ByteArrayOutputStream();
				
//		InputStream for read The data to file Student
		var finp1 = new FileInputStream("E:\\\\13-FileHandlingConcept\\student.txt");
		
//		this is user write the data own  self and hold the data
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try(foutp1; foutp2; foutp3; foutp4; finp1; byteop; bf){
			System.out.print ("Enter the data to file Student : ");
			String str = bf.readLine();
			
			byte [] strData = str.getBytes();//convert the string data into Unicode
			
//			here write the data to file Student
			foutp4.write(strData);
			
//			here read the data to file Student
		    int getDataStudent;
			while((getDataStudent = finp1.read())!=-1) {
				System.out.print((char)getDataStudent);
				
//				here we are write the data again three file a, b, c
				byteop.write(getDataStudent);
			}
			byteop.writeTo(foutp1);
			byteop.writeTo(foutp2);
			byteop.writeTo(foutp3);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
