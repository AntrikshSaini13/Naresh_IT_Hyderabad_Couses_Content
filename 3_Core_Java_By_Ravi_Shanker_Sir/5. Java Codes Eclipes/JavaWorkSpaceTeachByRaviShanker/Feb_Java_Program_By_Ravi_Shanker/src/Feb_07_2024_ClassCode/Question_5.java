package Feb_07_2024_ClassCode;

//parameterized constructor No Argument constructor with final variable

class Demo
{	
	final int A; // blank final variable
	
	public Demo()  //No Argument constructor
	{		
		A = 15;
		System.out.println(A);
	}

	public Demo(int x)  //parameterized constructor
	{		
		A = x;
		System.out.println(x);
	}   

}	
public class  Question_5
{
	public static void main(String[] args) 
		{		
	         Demo d1 = new Demo(); //d1 -> A = 15 

	         Demo d2 = new Demo(8); //d2 -> A = 8	 
	    }
}
