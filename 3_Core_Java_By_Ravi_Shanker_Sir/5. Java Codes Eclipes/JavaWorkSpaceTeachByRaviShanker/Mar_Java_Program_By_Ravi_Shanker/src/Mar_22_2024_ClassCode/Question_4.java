package Mar_22_2024_ClassCode;

import java.io.*;
public class Question_4
{
  public static void main(String[] args) throws IOException
	{
       	var fr = new FileReader("C:\\Batch28\\Image.jpg");
	   	var  fw = new FileWriter("C:\\Batch28\\xyz.jpg");
	   
		try(fr;fw)
		{
		        int i;
		        while((i=fr.read())!= -1)
			{
				fw.write(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Success");
    }
}
