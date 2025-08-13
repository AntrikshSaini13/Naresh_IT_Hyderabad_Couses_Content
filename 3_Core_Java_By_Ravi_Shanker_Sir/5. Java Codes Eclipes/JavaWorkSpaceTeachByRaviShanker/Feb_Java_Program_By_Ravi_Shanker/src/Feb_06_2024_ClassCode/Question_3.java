package Feb_06_2024_ClassCode;

//Sealed and non-sealed and method override


sealed class Bird permits Parrot, Peacock
{
	public void roam()
	{
      System.out.println("Bird is roaming");		
	}
}
non-sealed class Parrot extends Bird
{
	public void roam()
	{
      System.out.println("Parrot is roaming");		
	}
}

non-sealed class Peacock extends Bird
{
	public void roam()
	{
      System.out.println("Peacock is roaming");		
	}
}

public class Question_3 {

	public static void main(String[] args) 
	{
		Bird b ;
		
		b = new Parrot(); b.roam();
		b = new Peacock(); b.roam();
	}

}
