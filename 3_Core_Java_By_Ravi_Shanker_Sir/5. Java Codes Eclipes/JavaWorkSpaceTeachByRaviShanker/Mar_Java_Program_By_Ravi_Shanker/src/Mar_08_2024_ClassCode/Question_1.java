package Mar_08_2024_ClassCode;

import java.util.*;

public class Question_1 
{
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
	  System.out.println("Welcome User, Welcome Here!!!");
	  Scanner sc = new Scanner(System.in);
	  try {
		  System.out.println(9/0);
	  }
	  catch(ArithmeticException e){
		  System.out.println("divoded by Zero");
	  }
	  
	  try {
		  String str = null;
		  System.out.println(str.length());
	  }
	  catch(NullPointerException e) {
		  System.out.println("String refernece is Null");
	  }
	  sc.close();
	}
}