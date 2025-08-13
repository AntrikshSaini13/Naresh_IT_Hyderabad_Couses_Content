package Feb_02_2024_Class_Code;

//Method @Overridden Annotations

class RBI1
{
	public void loanOne()
	{
		System.out.println("Bank should provide loan..");
	}
}
class SBI1 extends RBI1
{
	@Override
	public void loan()
	{
		System.out.println("SBI provides loan @ 9.2 %");
	}
}
class BOB1 extends RBI1
{
	@Override
	public void loan()
	{
		System.out.println("BOB provides loan @ 10.4 %");
	}
}
public class Question_2
{
	public static void main(String[] args) 
	{
		RBI1 r1;
		
		r1 = new SBI1(); r1.loan();
		
		r1 = new BOB1(); r1.loan();
		
	}

}

//Output :
//	
//		java.lang.Error: Unresolved compilation problems: 
//		The method loan() is undefined for the type RBI1
//		The method loan() is undefined for the type RBI1
