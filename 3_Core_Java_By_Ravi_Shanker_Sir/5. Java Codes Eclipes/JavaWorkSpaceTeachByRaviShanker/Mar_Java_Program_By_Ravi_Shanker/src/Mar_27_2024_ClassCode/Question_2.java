package Mar_27_2024_ClassCode;

class Sample extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1; i<=10; i++)
		{
		   System.out.println(i+" by "+name+ " thread");
		}
	}
}
class Sample1 extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" by "+name+ " thread");
		}
	}
}
public class Question_2 
{	
	public static void main(String[] args) throws InterruptedException // this main thread create JVM
	{
	   System.out.println("Main Thread Started!!!");
	   
	   Sample s1 = new Sample();  
	          s1.start(); // here  we are Create thread-0
//	          s1.join();
	   Sample s2 = new Sample();  
	          s2.start(); // here  we are Create thread-0
//	          s1.join();
	   
	   String name = Thread.currentThread().getName();
	   s1.join();
	   for(int i=1; i<=10; i++)
	   {
		   System.out.println(i+" by "+name+ " thread");
	   }
	   
	   int x = 1;
	   do
	   {
		   System.out.println("India");
		   x++;
	   }
	   while(x<=10);
	   
	   
	}
}
