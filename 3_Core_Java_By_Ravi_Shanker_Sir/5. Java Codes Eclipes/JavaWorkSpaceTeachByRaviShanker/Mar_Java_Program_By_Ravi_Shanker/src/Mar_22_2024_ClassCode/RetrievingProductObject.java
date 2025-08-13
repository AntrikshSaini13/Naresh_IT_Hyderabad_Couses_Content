package Mar_22_2024_ClassCode;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//ELC
public class RetrievingProductObject 
{
	public static void main(String[] args) throws Exception 
	{
	   var fin = new FileInputStream("C:\\new\\Product.txt");	
	   var ois = new ObjectInputStream(fin);
	   
	   try(fin;ois)
	   {
		  Product p = null;
		  while((p = (Product)ois.readObject())!=null)
		  {
			 System.out.println(p); 
		  }		      
	   }
	   catch(Exception e)
	   {
		   System.err.println("End if file reached");
	   }
	}
}
