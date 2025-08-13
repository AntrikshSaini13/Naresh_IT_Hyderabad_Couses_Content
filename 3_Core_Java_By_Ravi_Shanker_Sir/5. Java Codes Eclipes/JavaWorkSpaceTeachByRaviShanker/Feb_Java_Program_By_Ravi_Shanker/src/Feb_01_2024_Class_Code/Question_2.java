package Feb_01_2024_Class_Code;

//Up-casting is here

class Animal1
{
	public void eat()
	{
       System.out.println("Generic Eating");
	}
}
class Lion1 extends Animal1
{
	public void eat()
	{
       System.out.println("Non Veg type Animal");
	}   
}
public class Question_2{
    public static void main(String args[]) 
    {
    	Animal a = new Lion(); 
		a.eat(); 	
    }
}

//Output:
//Non Veg type Animal
