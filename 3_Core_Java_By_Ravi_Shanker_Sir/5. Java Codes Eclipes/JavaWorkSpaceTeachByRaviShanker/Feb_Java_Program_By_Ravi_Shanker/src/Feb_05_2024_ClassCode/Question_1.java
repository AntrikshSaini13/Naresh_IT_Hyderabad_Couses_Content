package Feb_05_2024_ClassCode;

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
public class Question_1 
{
	public static void main(String[] args) 
	{
		Bird b = new Parrot();
		
		System.out.println(b.name + ": "+b.roam());

	}

}

//Output : 
//	
//	General Bird: Parrot Bird is roaming
