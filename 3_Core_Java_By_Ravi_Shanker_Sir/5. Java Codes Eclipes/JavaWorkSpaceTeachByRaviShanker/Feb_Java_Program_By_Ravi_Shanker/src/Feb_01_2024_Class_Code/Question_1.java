package Feb_01_2024_Class_Code;

class Animal
{
	public void eat()
	{
       System.out.println("Generic Eating");
	}
}
class Lion extends Animal
{
	public void eat()
	{
       System.out.println("Non Veg type Animal");
	}   
}
public class Question_1
{
    public static void main(String args[]) 
    {
    	Animal a = new Lion(); 
		a.eat(); 
		
		Lion l = (Lion) new Animal();
		l.eat();
    }
}

//Output:
//	
//	But by using above statement (Downcasting) whenever we call a method we will get a runtime exception called java.lang.
//	ClassCastException. [Animal cann't be  cast to Lion]