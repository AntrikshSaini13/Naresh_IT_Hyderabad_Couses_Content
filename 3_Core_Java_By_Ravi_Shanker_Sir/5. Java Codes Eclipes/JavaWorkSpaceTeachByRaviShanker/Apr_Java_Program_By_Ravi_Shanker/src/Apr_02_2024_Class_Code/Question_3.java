package Apr_02_2024_Class_Code;
class PrintTable
{
	    public synchronized void printTable(int n)
	    {
	       for(int i=1; i<=3; i++)
	       {
	    	   System.out.println(n+" X "+i+" = "+(n*i));
	    	   try
	    	   {
	    		   Thread.sleep(500);
	    	   }
	    	   catch(Exception e)
	    	   {	    		   
	    	   }
	       }
	       System.out.println(".......................");
	    }	
}

public class Question_3
{
	public static void main(String[] args) 
	{
		PrintTable pt1 = new PrintTable(); //lock1		
		PrintTable pt2 = new PrintTable(); //lock2
		
		Thread t1 = new Thread()  //Anonymous inner class concept
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(2);	//lock1
			       }			   
				};
		       	        
		        Thread t2 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(3);	//lock1
			       }			   
				};
		                
		        Thread t3 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(6);	//lock2
			       }			   
				};
		               
		        Thread t4 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(9); //lock2
			       }			   
				};
				 t1.start();	t2.start();	 t3.start();  t4.start(); 
	}
}

//So, from the above program it is clear that synchronization will not work with multiple 
//objects.

