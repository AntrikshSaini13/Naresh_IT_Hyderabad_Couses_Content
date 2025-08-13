package Feb_05_2024_ClassCode;

//If we write static methods in the super and sub class with same signature and same or return 
//type then it looks like static method is overridden but actually it is METHOD HIDING. The sub 
//class static method is hidden from super class static method as shown in the program.
//----------------------------------------------------------------------
class Super
{
	public static void m1()
	{
		System.out.println("Static method of Super class");
	}
}
class Sub extends Super
{
	//Method Hiding
	public static void m1()
	{
		System.out.println("Static method of Sub  class");
	}
}
public class Question_5
{
	public static void main(String[] args) 
	{
		Super s1 = new Sub();
		s1.m1();
		
	}
}

//Here we will get the output :- static method of super class
//
//Note :- We cannot apply @Override annoatation on static methods.
