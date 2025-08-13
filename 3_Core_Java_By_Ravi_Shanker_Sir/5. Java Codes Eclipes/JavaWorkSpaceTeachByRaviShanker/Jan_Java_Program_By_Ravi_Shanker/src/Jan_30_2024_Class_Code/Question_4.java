package Jan_30_2024_Class_Code;

class Demo1{
	public void dem1(Object ...args) {
		Integer a = Integer.valueOf(15);
		
		Integer b = Integer.valueOf("25");

        Integer c = Integer.valueOf("111",10); //Here Base we can take upto 36

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a+b+c);
	}
}

public class Question_4 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.dem1("25","25");
	}
}
