package Mar_09_2024_ClassCode;

import java.io.Closeable;
import java.io.IOException;


class DatabaseResource implements AutoCloseable
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("File Resource closed successfully");		
	}

}
class FileResource implements Closeable
{
	
	@Override
	public void close() throws IOException 
	{
		System.out.println("Database Resource closed successfully");		
	}

}

//interface Closeable extends AutoCloseable{
//	void close() throws Exception;
//}

//class DatabaseResource implements AutoCloseable{
//	@Override
//	public void close() throws Exception 
//	{
//		System.out.println("Database Resource closed successfully");		
//	}
//	
//}
//class FileResource implements AutoCloseable{
//	@Override
//	public void close() throws Exception 
//	{
//		System.out.println("FileResource Resource closed successfully");		
//	}
//	
//}
//
public class Question_2 {
	public static void main(String[] args) throws Exception 
	{
		DatabaseResource dr = new DatabaseResource();
		FileResource fr = new FileResource();
		
		try( fr; dr)
		{
		System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divide by zero");
		}
	}
}
