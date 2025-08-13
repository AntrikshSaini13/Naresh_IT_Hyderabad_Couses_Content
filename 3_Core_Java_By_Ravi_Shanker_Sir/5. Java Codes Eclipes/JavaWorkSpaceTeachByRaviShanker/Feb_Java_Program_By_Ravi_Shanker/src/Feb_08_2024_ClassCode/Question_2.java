package Feb_08_2024_ClassCode;

//hashCode()

class Test
{
	
}
public class Question_2 
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		Test t2 = t1;
		System.out.println(t1.hashCode()+" : "+t2.hashCode());
		
		System.out.println("...............");
		
		Test t3 = new Test();
		Test t4 = new Test();
		System.out.println(t3.hashCode()+" : "+t4.hashCode());
	}

}