package Mar_21_2024_Lab_Test;

import java.io.*;


public class Question_1{
	public static void main(String[] args) throws FileNotFoundException {
		
		var fout = new FileOutputStream("E:\\13-FileHandlingConcept\\Student.txt");
		
		var fin = new FileInputStream("E:\\13-FileHandlingConcept\\Student.txt");
		
		try(fout;fin){			
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
//			String s = "Hyd is a popular IT City in India";		
			
			System.out.println("Enter the Name");
			String str = bf.readLine();
					
			 byte b[] = str.getBytes();	
			 
			 for(byte bs : b) {
				 System.out.print(bs+"\n");
			 }
			 
			 fout.write(b);

			 System.out.println("Success....");
			 while(true)
			 {
				 int i = fin.read();
				 if(i==-1)
					 break;
				 	 System.out.print((char)i);
			 }
		}
		catch(IOException e) {
			e.getStackTrace();
		}		
	}
}
