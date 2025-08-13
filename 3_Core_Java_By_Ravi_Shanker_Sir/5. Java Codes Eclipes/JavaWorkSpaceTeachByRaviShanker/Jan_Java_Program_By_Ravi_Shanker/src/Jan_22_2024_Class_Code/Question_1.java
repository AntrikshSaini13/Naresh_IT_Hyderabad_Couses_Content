package Jan_22_2024_Class_Code;

// without Super key word come here variable shadow

class Father
{
  protected double balance = 50000;	
}
class Son extends Father
{
	protected double balance = 18000;	
	
	public void showBalance()
	{
		System.out.println("Son balance is :"+balance);
		System.out.println("Father balance is :"+balance); //here we can not access the parent class 
	}
}

public class Question_1
{
	public static void main(String[] args)
	{
		Son s = new Son();
		s.showBalance();
	}

}