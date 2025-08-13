package Feb_24_2024_ClassCode;

@FunctionalInterface
interface Callable 
{
   public abstract void call();
   
   public String toString();
   
   public int hashCode();
   
   public boolean equals(Object obj);
   
}
class Call implements Callable{

	@Override
	public void call() {
		System.out.println("Sub call class");
		
	}
	
}

public class Question_3 {
	public static void main(String[] args) {
		Callable c = new Call();
		c.call();
		System.out.println(c.toString());
		System.out.println(c.hashCode());
		System.out.println(c.equals(c));
	}
}
