package Feb_10_2024_ClassCode;


//Instance Operator

public class Question_1
{
	public static void main(String[] args) 
	{
		String str = "India";

        if(str instanceof String)
		{
			System.out.println("str is pointing to String object : "+str);
		}
        System.out.println("...........");

        String s1 = "Hyderabad";

		if(s1 instanceof Object)
		{
			System.out.println("s1 is pointing to String object : "+s1);
		}
		else
		{
			System.out.println("s1 is pointing to StringBuffer object : "+s1);
		}
		System.out.println("...........");

		Integer i = 90;
		if(i instanceof Number)
		{
			System.out.println(" i is pointing to Integer object : "+i);
		}

	}
}