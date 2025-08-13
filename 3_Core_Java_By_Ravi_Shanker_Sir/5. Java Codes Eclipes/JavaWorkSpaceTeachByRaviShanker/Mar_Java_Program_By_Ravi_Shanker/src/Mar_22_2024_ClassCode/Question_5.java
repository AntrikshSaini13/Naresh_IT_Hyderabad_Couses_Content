package Mar_22_2024_ClassCode;

//PrintWriter 
import java.io.*;
public class Question_5
{
public static void main(String[] args) throws IOException
	{
	    PrintWriter writeData = new PrintWriter("C:\\Batch28\\Roll.txt");

        try(writeData)
	    {      
            int roll = 15;
            //Writing primitive data into text format
            writeData.printf("My roll number is : %d ", roll);    
         }
         catch(Exception e) 
	   {
             e.printStackTrace();
  	   }
}
}
