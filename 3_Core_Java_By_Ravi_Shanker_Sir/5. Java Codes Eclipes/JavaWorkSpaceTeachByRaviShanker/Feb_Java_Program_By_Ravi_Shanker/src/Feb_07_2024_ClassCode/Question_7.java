package Feb_07_2024_ClassCode;

class Demo2
{	
	final int A; // blank final variable
	
//	instance Block
	public void demo(){		
		this.A = 15;
		System.out.println(A);
	}
	
//	instance Block
	public void demo1(int A){		
		this.A = A;
		System.out.println(A);
	}


}	
public class  Question_7
{
	public static void main(String[] args) 
		{		
	         Demo2 d1 = new Demo2();
	         d1.demo1(0);
	    }
}