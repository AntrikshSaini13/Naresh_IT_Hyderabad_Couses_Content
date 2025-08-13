package Mar_20_2024_Lab_Task;

import java.io.*;
public class Question_2 {
	public static void main(String[] args) throws IOException {
		var foutp1 = new FileOutputStream("E:\\\\13-FileHandlingConcept\\Four.txt");
		
		var finp1 = new FileInputStream("E:\\5-JavaWorkSpace\\Mar_Java_Program_By_Ravi_Shanker\\src\\Mar_20_2024_Lab_Task\\Question_1.java");
		var finp2 = new FileInputStream("E:\\5-JavaWorkSpace\\Mar_Java_Program_By_Ravi_Shanker\\src\\Mar_20_2024_Lab_Task\\Question_2.java");
				
//		here we can get the data of two file only by use SequenceInputStream
		var sqe = new SequenceInputStream(finp1, finp2);		
		try(finp1; finp2; foutp1; sqe){
			int getData;
			while((getData = sqe.read())!=-1) {
				System.out.print((char)getData);
				foutp1.write(getData);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
