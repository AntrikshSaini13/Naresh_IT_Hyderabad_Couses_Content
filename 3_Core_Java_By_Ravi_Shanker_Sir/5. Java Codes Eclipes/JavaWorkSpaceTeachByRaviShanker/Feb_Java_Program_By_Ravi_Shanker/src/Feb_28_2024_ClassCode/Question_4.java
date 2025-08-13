package Feb_28_2024_ClassCode;

class Demo
{
	
	final static int a ;	//Blank final variable

	static
	{	
		a = 100;
		System.out.println(a); 
	}
}	
public class  Question_4
{
	public static void main(String[] args) 
		{		
	         System.out.println("a value is :"+Demo.a);		
	    }
}

//Note :- blank final variable must be initialized through static 
//        block only.
