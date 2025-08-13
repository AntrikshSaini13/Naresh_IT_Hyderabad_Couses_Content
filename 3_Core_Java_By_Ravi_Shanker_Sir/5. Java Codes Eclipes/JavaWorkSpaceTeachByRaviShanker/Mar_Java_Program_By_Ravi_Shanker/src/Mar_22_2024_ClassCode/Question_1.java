package Mar_22_2024_ClassCode;

//FileWriter
import java.io.*;
public class Question_1
{
  public static void main(String args[]) throws IOException
  {
       var fw = new FileWriter("C:\\Batch28\\HelloIndia.txt");
       var bw = new  BufferedWriter(fw);

		 try(fw; bw)
		 {
       		bw.write("India, It is in Asia");
       		System.out.println("Success....");
		 }
		 catch(IOException e)
		  {
			  e.printStackTrace();
		  }
  }
}
