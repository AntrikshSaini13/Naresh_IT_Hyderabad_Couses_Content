package Feb_02_2024_Class_Code;

// Co-varient relations is her apply but not work  

class Super
{
	public void show()
	{
		System.out.println("Super class show method");
	}
}
class Sub extends Super
{
	@Override
	public int show()  //error [] here we can't change
	{
		System.out.println("Sub class show method");
		return 0;
	}
}

public class Question_4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
