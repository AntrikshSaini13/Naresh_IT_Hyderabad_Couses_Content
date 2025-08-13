package Mar_22_2024_ClassCode;

//FileReader
import java.io.*;
public class Question_3
{
  public static void main(String args[]) throws IOException
  {
       var fr = new FileReader(args[0]); //Command Line Arg
	 var br = new BufferedReader(fr);

		 try(fr ; br)
		 {
       		while(true)
       		{
            		int i = br.read();
            		if(i == -1)
                 	break;
            		System.out.print((char)i);
       		}
		 }
		 catch(IOException e)
		 {
			  e.printStackTrace();
		 }         
  }
}