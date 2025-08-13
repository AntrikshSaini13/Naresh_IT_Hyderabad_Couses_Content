package Apr_04_2024_Lab_Test;

//Write a Java program that creates two threads: one for printing "Hello" and 
//the other for printing "World." Ensure that "Hello" is always printed before "World.", 
//Dont extend Thread or implement Runnable execute it by using anonymous inner class or lambda.
//
//
//
//NOTE :
//
//-------
//
//"Hello" should be printed with anonymous class
//
//
//
//"World" should be printed with lambda expression 



//class ThreadName
//{
//	public void printThreadName()
//	{		  		
//	  String name = Thread.currentThread().getName();
//	  System.out.println("Thread inside the method is :"+name);		   		   
//			{
//				System.out.println("i value is :"+i+" by :"+name);
//			}
//			System.out.println(".............................");
//		  	
//	}
//}
public class Question_2
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadName obj1 = new ThreadName(); //lock is created	
		
		Runnable r1 = () -> System.out.println("Hello");
		Runnable r2 = () -> System.out.println("World");
		
		Thread t1 = new Thread(r1,"Child1"); 
		Thread t2 = new Thread(r2,"Child2"); 
		t1.start(); 
		t2.start();				
	}
}
