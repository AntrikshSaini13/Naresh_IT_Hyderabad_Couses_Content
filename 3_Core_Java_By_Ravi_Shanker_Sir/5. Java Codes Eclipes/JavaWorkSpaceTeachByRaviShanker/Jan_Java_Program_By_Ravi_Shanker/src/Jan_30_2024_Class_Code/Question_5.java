package Jan_30_2024_Class_Code;


class ValOf{
	
	public void show(String a, String a1, String a2) {
//		here use 'parseInt()' and "valueOff()"
		int x = Integer.parseInt(a);
		Integer y = Integer.valueOf(x);
		
		int x1 = Integer.parseInt(a1);
		Integer y1  = Integer.valueOf(x1);

		int x2 = Integer.parseInt(a2);
	    Integer y2 = Integer.valueOf(x2); //Here Base we can take upto 36
	    
	    System.out.println("With using 'parseInt()' and 'valueOff()'");
		System.out.println(y);
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println("Sum is : "+(x+x1+x2));
	    
//		here use 'valueOf()'
		Integer z = Integer.valueOf(a);
		
		Integer z1  = Integer.valueOf(a1);
		
		Integer z2 = Integer.valueOf(a2);

	    System.out.println("Without using 'valueOf()'");
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		
		System.out.println("Sum is :"+(z+z1+z2));
		
//		parseInt() to int primitive
		
		System.out.println("parseInt() to int primitive");
		int b = Integer.parseInt(a);
		int b1 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(a2);
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("Sum  is : "+(b+b1+b2));		
		
//		parseInt() to Integer
		System.out.println("parseInt() to Integer Wrapper");
		Integer c = Integer.parseInt(a);
		Integer c1 = Integer.parseInt(a1);
		Integer c2 = Integer.parseInt(a2);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("Sum  is : "+(c+c1+c2));	
	}
}

public class Question_5 {
	public static void main(String[] args) {
		
		ValOf v1 = new ValOf();
		v1.show("25", "26", "17");
	}
}


