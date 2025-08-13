package Feb_07_2024_ClassCode;

//Different kinds of final variable :

public class Question_1 
{
    final int A = 12;
    static final int B = 24;
    
    public void accept(final int C)
    {
    	System.out.println("A value is :"+A);
    	System.out.println("B value is :"+Question_1.B);
    	System.out.println("C value is :"+C);
    }
    
	public static void main(String[] args) 
	{
		final Question_1 v = new Question_1();
		v.accept(36);
			
	}
}

//Output :
//	A value is :12
//	B value is :24
//	C value is :36