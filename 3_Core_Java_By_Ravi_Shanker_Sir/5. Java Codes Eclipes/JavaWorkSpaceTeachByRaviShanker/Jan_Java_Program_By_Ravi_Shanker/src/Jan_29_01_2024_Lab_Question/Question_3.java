package Jan_29_01_2024_Lab_Question;

//Program 03:
//------------
//Create a class named 'PrintNumber' to print various numbers of different datatypes 
//by creating different methods with the same name 'printn' having a parameter for each 
//datatype.
////
//Expected Output:
//
//In integer 3
//
//In long 33223222332
//
//In double 323233.44
//
//In float 33344.5
//
//In Char A
//
//In String Overloading

class PrintfNumber{
	public void printn(byte num) {
		System.out.println("byte : "+ num);
	}
	public void printn(short num) {
		System.out.println("short : "+ num);
	}
	public void printn(int num) {
		System.out.println("Interger : "+ num);
	}
	public void printn(Long num) {
		System.out.println("long : "+ num);
	}
	public void printn(float num) {
		System.out.println("float : "+ num);
	}
	public void printn(double num) {
		System.out.println("double : "+ num);
	}
	public void printn(char ch) {
		System.out.println("char : "+ ch);
	}
}

public class Question_3 {
	public static void main(String[] args) {
		PrintfNumber p1 = new PrintfNumber();
		
//		here perform type Casting 
		p1.printn((byte)25);
		p1.printn((short)25);
		p1.printn(25); 
		p1.printn((long)25);
		p1.printn((float)25);
		p1.printn(25.2);
		p1.printn('5');
	}
}

//output:
//	
//	byte : 25
//	short : 25
//	Interger : 25
//	float : 25.0
//	float : 25.0
//	double : 25.2
//	char : 5
