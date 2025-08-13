package Mar_29_2024_ClassCode;

//Case 2: Creating Anonymous Thread class without reference :
//----------------------------------------------------------

public class Question_3 {

	public static void main(String[] args) 
	{
	   new Thread()
	   {
		   @Override
			public void run()
			{
				Thread t = Thread.currentThread();
				System.out.println(t.getName());
				System.out.println(t.getId());
			}  
	   }.start();

	}

}