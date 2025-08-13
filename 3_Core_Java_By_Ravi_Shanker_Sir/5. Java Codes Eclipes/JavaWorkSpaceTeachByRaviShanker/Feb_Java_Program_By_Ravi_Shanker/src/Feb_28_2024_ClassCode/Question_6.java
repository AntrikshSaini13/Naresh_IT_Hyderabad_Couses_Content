package Feb_28_2024_ClassCode;

//illegal forward reference

class Demo1 
{	
  static 
	{   
		i = 100;		
	}
  static int i;//default value 0 than after 100 will be value
}
public class Question_6
{
  public static void main(String[] args) 
	{
      System.out.println(Demo1.i);//100
	}
}

//Note :- In the prepare phase, static variable memory is already 
//      allocated so initialization is possible.
