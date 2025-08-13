package Feb_15_2024_ClassCode;

import java.util.Scanner;

//Assignment :
//-------------
//Take one interface Calculator which contains the following abstract methods :
//  
//     void doSum(int x, int y);
//     void doSub(int x, int y);
//     void doMul(int x, int y);


interface Calculate{
	
	  void doSum(int x, int y);
	  void doSub(int x, int y);
	  void doMul(int x, int y);
	  void dodiv(int x, int y);
	  
}

class Calculater implements Calculate{
	
	int x;
	int y;
	
	public Calculater() {
		super();
		this.x = 10;
		this.y = 10;
	}
	
	public Calculater(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void doSum(int x, int y) {
		System.out.println("Sum : "+(x+y));
	}
	
	@Override
	public void doSub(int x, int y) {
		System.out.println("Sub : "+(x-y));
	}
	
	@Override
	public void doMul(int x, int y) {
		System.out.println("Mul : "+(x*y));
	}
	
	@Override
	public void dodiv(int x, int y) {
		System.out.println("Div : "+(x/y));
	}

	@Override
	public String toString() {
		return "Calculater [x=" + x + ", y=" + y + "]";
	}

		
}


public class Question_4{
	public static void main(String[] args) {
		
//		Up-Casting
		Calculate c1 ;
		
		c1  = new Calculater();
		System.out.println("This Value Of Non parameterized Constructor \n"+c1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the value of x and y");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		c1 =  new Calculater(x,y);
		
		c1.dodiv(x, y);
		c1.doMul(x, y);
		c1.doSub(x, y);
		c1.doSum(x, y);
		
		System.out.println("Return toString Method here \n"+c1);
		
//		Sub-Class Object
		Calculater c2 = new Calculater(x,y);
		
		System.out.println("\nEnter the value of x and y");
		
		int x1 = sc.nextInt();
		int y2 = sc.nextInt();
		
		c2.setX(x1);
		c2.setY(y2);
		
		c2.dodiv(x1, y2);
		c2.doMul(x1, y2);
		c2.doSub(x1, y2);
		c2.doSum(x1, y2);
		
		System.out.println("\nReturn toString Method here \n"+c2);
		sc.close();
	}
}

//Output :
//	
//	This Value Of Non parameterized Constructor 
//	Calculater [x=10, y=10]
//
//	Enter the value of x and y
//	45
//	41
//	Div : 1
//	Mul : 1845
//	Sub : 4
//	Sum : 86
//	Return toString Method here 
//	Calculater [x=45, y=41]
//
//	Enter the value of x and y
//	85
//	74
//	Div : 1
//	Mul : 6290
//	Sub : 11
//	Sum : 159
//
//	Return toString Method here 
//	Calculater [x=85, y=74]




























