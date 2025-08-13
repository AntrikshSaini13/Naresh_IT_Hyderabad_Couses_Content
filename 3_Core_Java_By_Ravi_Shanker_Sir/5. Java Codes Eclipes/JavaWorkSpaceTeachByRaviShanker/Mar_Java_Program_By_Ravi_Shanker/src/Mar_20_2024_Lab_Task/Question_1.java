package Mar_20_2024_Lab_Task;


import java.io.*;

public class Question_1{
	public static void main(String[] args) throws IOException {
//		Output Stream for write the data to the file
		var fop  = new FileOutputStream("E:\\13-FileHandlingConcept\\three.txt");
//		Input Stream for read the data to the file
		var fip  = new FileInputStream("E:\\13-FileHandlingConcept\\two.txt");
//		this is user write the data own  self and hold the data
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
//		Apply the try with resource
		try(fop; fip; bf){
//			here we are writing the data to the file
			System.out.print("Enter own data : ");
			String str = bf.readLine();
			
			byte [] convertUniodeOfStrinf = str.getBytes();// this method for convert the string data into unicode
			fop.write(convertUniodeOfStrinf);// this method write the data into the file
			
//			here we are read the data to the file
			int getData;
			while(true) {// when ever file is blank return -1 then loop is break
				getData = fip.read();
				if(getData == -1) {
					break;				}
				System.out.print((char)getData);
			}			
		}
		catch(IOException e) {
			e.printStackTrace();
		}		
	}
}