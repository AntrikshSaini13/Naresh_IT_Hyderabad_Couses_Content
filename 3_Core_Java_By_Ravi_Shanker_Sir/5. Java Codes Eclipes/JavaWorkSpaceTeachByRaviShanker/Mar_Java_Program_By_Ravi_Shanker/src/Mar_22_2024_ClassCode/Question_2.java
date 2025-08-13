package Mar_22_2024_ClassCode;

//FileWriter
import java.io.*;
public class Question_2
{
  public static void main(String args[]) throws IOException
  {
		var fw = new FileWriter("C:\\Batch28\\Data.txt");
		var bw = new  BufferedWriter(fw);

      try(fw;bw)
		{        
    	  	char c[ ] =  {'H','E','L','L','O', ' ',' ','W','O','R','L','D'};
		 
       	 	bw.write(c);
       		System.out.println("Success....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
  }
}
