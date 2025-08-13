package Feb_02_2024_Class_Code;


class Bird
{
	String name = "General Bird";
	
	public String roam()
	{
		return "Generic Bird is roaming";
	}
}
class Parrot extends Bird
{
	String name = "Parrot Bird";  //Variable Shadow
	
	@Override
	public String roam()
	{
		return "Parrot Bird is roaming";
	}
}
public class Question_9
{
	public static void main(String[] args) 
	{
		Bird b = new Parrot();
		
		System.out.println(b.name + ": "+b.roam());

	}

}