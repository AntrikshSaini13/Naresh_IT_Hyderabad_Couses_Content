package Jan_30_2024_Class_Code;

public class Question_3 {
	public static void main(String[] args) 
	{
			Integer a = Integer.valueOf(15);
			
			Integer b = Integer.valueOf("25");

            Integer c = Integer.valueOf("111",10); //Here Base we can take upto 36

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			System.out.println(a+b+c);

	}
}

//Output

//15
//25
//111
//151
