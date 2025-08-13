package Feb_16_2024_ClassCode;

interface Alpha
{
	void m1();
}
interface Beta extends Alpha
{
	void m2();
}

class C implements Beta
{
	@Override
	public void m1() 
	{
		System.out.println("m1 method implemented");		
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 method implemented");			
	}	
}

public class ExtendingInterface 
{
	public static void main(String[] args) 
	{
      		C c1 = new C();
      		c1.m1();  
      		c1.m2();
      		
      		Beta c2 = new C();
      		c2.m1();  
      		c2.m2();
      		
      		Alpha c3 = new C();
      		c3.m1();  
//      		c3.m2();// invalid because Alpha interface is not access the data of beta inrtface because of beta is sub class/interface of alpha interface(concept of inheritance)
	}

}
