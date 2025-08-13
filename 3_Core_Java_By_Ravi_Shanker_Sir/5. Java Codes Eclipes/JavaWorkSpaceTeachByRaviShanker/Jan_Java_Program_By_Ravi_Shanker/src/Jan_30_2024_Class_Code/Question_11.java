package Jan_30_2024_Class_Code;

public class Question_11 {
	public static void main(String[] args) {

		Integer x = Integer.valueOf("1451") ;//valid
		System.out.println(x);
		
		Integer x1 = Integer.valueOf("1111",2) ;//valid
		System.out.println(x1);
		
		Integer x2 = Integer.valueOf("1452",8) ;//valid
		System.out.println(x2);
		
		Integer x3 = Integer.valueOf("145ff",16) ;//valid
		System.out.println(x3);
		
//		Integer x4 = Integer.valueOf("1451.25") ;//Error
//		System.out.println(x4);
		
		Integer x5 = Integer.valueOf(1254) ;//valid
		System.out.println(x5);
		
//		Integer x6 = Integer.valueOf(125.25) ;//Error
//		System.out.println(x5);
//		
//		Integer x7 = Integer.valueOf("Aman") ;//Error : For input string: "Aman"
////												at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//		System.out.println(x7);
		
		Integer x8 = Integer.valueOf('A') ;// Valid
		System.out.println(x8);
		
//		Integer x9 = Integer.valueOf(true) ;//Error :-> The method valueOf(String) in the type Integer is not applicable for the arguments (boolean)
//		System.out.println(x9);			
	}
}
