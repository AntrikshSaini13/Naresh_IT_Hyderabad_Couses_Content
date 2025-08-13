package Mar_22_2024_ClassCode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//ELC
public class StoringProductObject 
{
	public static void main(String[] args) throws IOException
	{
	  var fos = new FileOutputStream("C:\\new\\Product.txt");
	  var oos = new ObjectOutputStream(fos);
	  Scanner sc = new Scanner(System.in);
	  
	  try(fos; oos; sc)
	  {		 
		 System.out.println("How many objects :");
		 int objects = sc.nextInt();
		 
		 for(int i=1; i<=objects; i++)
		 {
			 Product product = Product.getProductObject();
			 oos.writeObject(product);
		 }
		 
		 
	  }
	  catch(Exception e)
	  {
		 e.printStackTrace(); 
	  }
       		System.out.println("Product Data stored...");
	}

}
