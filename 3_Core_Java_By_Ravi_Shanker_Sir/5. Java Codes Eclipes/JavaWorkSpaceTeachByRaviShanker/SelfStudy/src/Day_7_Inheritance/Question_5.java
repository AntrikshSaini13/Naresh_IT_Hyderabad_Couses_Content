package Day_7_Inheritance;

//Parameter Constructor

class One1 {
	int x;
	int y;
	One1(int a, int b){
		x = a;
		y = b;
		System.out.println("Parent Constructor");
		
		System.out.println("x = "+x+"\ny = "+y);
	}
}

class Two2 extends One1 {
	int u;
	int v;
	Two2(int c, int d){
		super(6,7);
		u = c;
		v = d;
		System.out.println("Child Constructor");
		
		System.out.println("x = "+u+"\ny = "+v);
	}
}

public class Question_5 {
	public static void main(String[] args) {
		Two2 t1 = new Two2(4,5);
	}
}
