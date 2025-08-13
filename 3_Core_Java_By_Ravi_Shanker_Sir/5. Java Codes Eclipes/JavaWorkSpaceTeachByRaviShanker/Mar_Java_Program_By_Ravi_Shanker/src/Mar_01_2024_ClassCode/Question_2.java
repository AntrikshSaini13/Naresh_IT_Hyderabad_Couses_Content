package Mar_01_2024_ClassCode;

//NoClassDefFoundErrorDemo.java
//------------------------------
class Hello
{
	public void m1()
	{
		System.out.println("m1 method of Hello class...");
	}
}
public class Question_2 
{
	public static void main(String[] args) 
	{
		Hello h = new Hello();
		h.m1();
	}
}

//After compilation delete Hello.class OR put the Hello.class file
//in another folder/location.
//
//So the conclusion is :
//java.lang.ClassNotFoundException does not have any concern at compilation time where as 
//java.lang.NoClassDefFoundError was checking the class name at the time of compilation