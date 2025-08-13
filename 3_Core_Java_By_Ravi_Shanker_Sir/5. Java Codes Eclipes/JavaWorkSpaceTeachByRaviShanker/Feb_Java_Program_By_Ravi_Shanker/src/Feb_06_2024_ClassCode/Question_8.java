package Feb_06_2024_ClassCode;

class A3
{
	final int A = 10;      
	public void setData()
	{
		 A = 10;  //error[Re-assignment is not possible]
		 System.out.println("A value is :"+A);
	}
}
class Question_8
{
	public static void main(String[] args) 
	{
		A3 a1 = new A3();
		a1.setData();
	}
}
