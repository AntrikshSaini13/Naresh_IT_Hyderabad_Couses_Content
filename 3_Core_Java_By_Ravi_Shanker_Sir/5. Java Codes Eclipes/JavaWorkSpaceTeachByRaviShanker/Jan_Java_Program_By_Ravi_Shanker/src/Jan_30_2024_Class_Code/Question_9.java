package Jan_30_2024_Class_Code;

public class Question_9 {
	public static void main(String[] args) {
		Integer x = Integer.valueOf("1451") ;//valid
		System.out.println(x);
		
		Integer x1 = Integer.valueOf("1111",2) ;//valid
		System.out.println(x1);
		
		Integer x2 = Integer.valueOf("1452",8) ;//valid
		System.out.println(x2);
		
		Integer x3 = Integer.valueOf("145ff",16) ;//valid
		System.out.println(x3);
		
		Integer x4 = Integer.valueOf("14");
		System.out.println(x4);
		
		System.out.println("Sum of x and x4 : "+(x+x4));

	}
}
