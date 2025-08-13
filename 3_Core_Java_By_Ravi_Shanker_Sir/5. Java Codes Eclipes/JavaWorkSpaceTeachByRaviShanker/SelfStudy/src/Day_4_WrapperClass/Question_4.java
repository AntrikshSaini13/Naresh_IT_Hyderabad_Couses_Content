package Day_4_WrapperClass;

public class Question_4 {
	public static void main(String[] args) {
		
		Integer x = Integer.valueOf(127) ;
		int x0 = x.intValue();
		System.out.println(x0);
		
		System.out.println("We are convert type Integer to Float, Long, Byte, Short Wrapper Class");
		
		double x1 = x.doubleValue();
		System.out.println(x1);
		
		long x2 = x.longValue();
		System.out.println(x2);
		
		float x3 = x.floatValue();
		System.out.println(x3);
		
		byte x4 = x.byteValue();
		System.out.println(x4);
		
		short x5 = x.shortValue();
		System.out.println(x5);		
	}
}

