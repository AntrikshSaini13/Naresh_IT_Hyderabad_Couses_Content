package Mar_11_2024_ClassCode;

public class Question_4 
{
	public static void main(String[] args) 
	{      
	   int x;
       try
       {   
    	   
    	   x = 12;
    	   System.out.println(x/0);
       }
       catch(Exception e)
       {    
    	   x = 15;
    	   System.out.println(x);
       }
      
       System.out.println("Main completed!!!"+x);
	}

}