package Jan_30_2024_Class_Code;

public class Question_6 {
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2);

		Integer a1 = Integer.valueOf(128);
		Integer a2 = Integer.valueOf(128);
		System.out.println(a1==a2);
		
		Integer b1 = Integer.valueOf(127);
		Integer b2 = Integer.valueOf(127);
		System.out.println(b1==b2);
	}
}
