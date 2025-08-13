package Mar_19_2024_ClassCode;

//Creating and writing the data to the file

import java.io.*;
public class Question_2
{
   public static void main(String args[]) throws IOException
   {
//	   FileOutputStream fout = new FileOutputStream("E:\\13-FileHandlingConcept\\Hyderabad.txt");
	   
	   var fout = new FileOutputStream("E:\\13-FileHandlingConcept\\Hyderabad.txt");
       try(fout)//here we are hendling the recourse exception
       {
    	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));// this is working style is like Scanner hold the data
//       String s = "Hyd is a popular IT City in India";
    	 
    	 System.out.println("Enter Your name ");
    	 String str = bf.readLine();// this store the data whose we are write

		 byte b[] = str.getBytes();// here with the help of getByte() we are convert the data string to UNICODE
		 
		 fout.write(b);// with help write() method we can write the data inside file

		 System.out.println("\nSuccess....");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
   }
}