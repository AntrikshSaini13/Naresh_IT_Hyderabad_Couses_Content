package Feb_28_2024_ClassCode;

class Demo2 
{
    static 
	{   
		i = 100; //Initialization is possible
		System.out.println(i); //Invalid Illegal Forward Reference
    }

    static int i;// default value 0
}

public class Question_7
{

    public static void main(String[] args) 
	{
		System.out.println(Demo2.i);
	}
}

//Note :- Without declaration of static variable, it is not possible to perform any 
//kind of read/access operation otherwise 
//we will get Illegal forward reference.
