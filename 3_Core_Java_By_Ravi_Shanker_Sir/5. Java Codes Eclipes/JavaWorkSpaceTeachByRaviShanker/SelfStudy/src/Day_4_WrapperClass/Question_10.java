package Day_4_WrapperClass;

public class Question_10 {
	public static void main(String[] args) {

		Integer x = Integer.parseInt("1451") ;//valid
		System.out.println(x);
		
		int x1 = Integer.parseInt("1111",2) ;//valid
		System.out.println(x1);
		
		int x2 = Integer.parseInt("1452",8) ;//valid
		System.out.println(x2);
		
		int x3 = Integer.parseInt("145ff",16) ;//valid
		System.out.println(x3);
		
//		int x4 = Integer.parseInt("1451.25") ;//Error :-> For input string: "1451.25" at java.base/java.lang.NumberFormatException.forInputString
//		System.out.println(x4);
	
//		int x5 = Integer.parseInt(1254) ;//Error :->  The method parseInt(String) in the type Integer is not applicable for the arguments (int)
//		System.out.println(x5);
		
//		int x6 = Integer.parseInt(125.25) ;//Error :->The method parseInt(String) in the type Integer is not applicable for the arguments (double) x5 cannot be resolved to a variable
//		System.out.println(x5);
	
//		intr x7 = Integer.parseInt("Aman") ;//Error : For input string: "Aman" at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//		System.out.println(x7);
		
//		int x8 = Integer.parseInt('A') ;//Error :-> The method parseInt(String) in the type Integer is not applicable for the arguments (char)
//		System.out.println(x8);
		
//		int x9 = Integer.parseInt(true) ;//Error :-> The method parseInt(String) in the type Integer is not applicable for the arguments (boolean)
//		System.out.println(x3);
}
}
