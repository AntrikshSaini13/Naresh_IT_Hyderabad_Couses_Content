package Feb_02_2024_Class_Code;

// Method @Overridden Annotations

class RBI
{
	public void loan()
	{
		System.out.println("Bank should provide loan..");
	}
}
class SBI extends RBI
{
	@Override
	public void loan()
	{
		System.out.println("SBI provides loan @ 9.2 %");
	}
}
class BOB extends RBI
{
	@Override
	public void loan()
	{
		System.out.println("BOB provides loan @ 10.4 %");
	}
}
public class Question_1
{
	public static void main(String[] args) 
	{
		RBI r1;
		
		r1 = new SBI(); r1.loan();
		
		r1 = new BOB(); r1.loan();
		
	}

}

//  Output : 
//	SBI provides loan @ 9.2 %
//	BOB provides loan @ 10.4 %