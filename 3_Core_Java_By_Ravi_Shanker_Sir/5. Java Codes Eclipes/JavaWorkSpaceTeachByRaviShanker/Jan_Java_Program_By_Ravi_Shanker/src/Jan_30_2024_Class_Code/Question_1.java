package Jan_30_2024_Class_Code;

public class Question_1 {
	public static void main(String[] args) 
	{
		int a = 12;
		Integer x = Integer.valueOf(a); //Upto 1.4 version
		System.out.println(x);

		
        int y = 15;
		Integer i = y;   //From 1.5 onwards compiler takes care
		System.out.println(i);	
		
		long a2 = 12;
		Long x2 = Long.valueOf(a2); //Upto 1.4 version
		System.out.println(x2);

		
        long y2 = 15;
		Long i2 = y2;   //From 1.5 onwards compiler takes care
		System.out.println(i2);	
		
		byte a3 = 12;
		Byte x3 = Byte.valueOf(a3); //Upto 1.4 version
		System.out.println(x3);

		
        byte y4 = 15;
		Byte i4 = y4;   //From 1.5 onwards compiler takes care
		System.out.println(i4);	
		
		short a5 = 12;
		Short x5 = Short.valueOf(a5); //Upto 1.4 version
		System.out.println(x5);

		
        short y5 = 15;
		Short i5 = y5;   //From 1.5 onwards compiler takes care
		System.out.println(i5);	
		
		float a1 = 12;
		Float x1 = Float.valueOf(a1); //Upto 1.4 version
		System.out.println(x1);

		
        float y1 = 15;
		Float i1 = y1;   //From 1.5 onwards compiler takes care
		System.out.println(i1);	
		
		double a6 = 12;
		Double x6 = Double.valueOf(a6); //Upto 1.4 version
		System.out.println(x6);

		
        double y6 = 15;
		double i6 = y6;   //From 1.5 onwards compiler takes care
		System.out.println(i6);	
		
		boolean a7 = true;
		Boolean x7 = Boolean.valueOf(a7); //Upto 1.4 version
		System.out.println(x7);

		
        boolean y7 = true;
		Boolean i7 = y7;   //From 1.5 onwards compiler takes care
		System.out.println(i7);	
		
		char a8 = 'A';
		Character x8 = Character.valueOf(a8); //Upto 1.4 version
		System.out.println(x8);

		
        char y8 = 'A';
		Character i8 = y8;   //From 1.5 onwards compiler takes care
		System.out.println(i8);	
	}

}

//Output
//
//12
//15
//12
//15
//12
//15
//12
//15
//12.0
//15.0
//12.0
//15.0
//true
//true
//A
//A

