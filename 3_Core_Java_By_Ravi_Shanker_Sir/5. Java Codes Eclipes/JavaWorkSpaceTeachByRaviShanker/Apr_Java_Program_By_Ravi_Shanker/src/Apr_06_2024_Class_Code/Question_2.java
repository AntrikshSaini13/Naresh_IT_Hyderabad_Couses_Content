package Apr_06_2024_Class_Code;


public class Question_2 
{
    int id;
    String name;
    
    public Question_2(int id, String name)
    {
    	this.id= id;
    	this.name = name;
    }    
    
	@Override
	public String toString() 
	{
		return "Id is :"+id+"\nName is :"+name;
	}

	@Override
	protected void finalize() 
	{
      		System.out.println("JVM call this finalize method...");		
	}


	public static void main(String[] args) throws InterruptedException 
	{
		Question_2 s1 = new Question_2(111,"Ravi");
      		System.out.println(s1.hashCode());
      		System.out.println(s1);
      
      		s1 = null;
     		System.gc(); //Explicitly calling Garbage Collector
      		Thread.sleep(3000);
     		System.out.println(s1);
	}

}


