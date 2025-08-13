package Jan_29_01_2024_Lab_Question;

//Program 01 :
//------------
//Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
//
//For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
//
//Expected Output:
//
//int=66 char=A
//
//int=67 char=D

class Test{
	private int num;
	private char ch;
	
//	here is Constructor
	public Test(int num, char ch) {
		super();
		this.num = num;
		this.ch = ch;
	}
	
//	toString Method
	@Override
	public String toString() {
		return "Test [num=" + num + ", ch=" + ch + "]";
	}
	
//	here is getter setter
	public int getNum() {
		return num;
	}
	public char getCh() {
		return ch;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
//	her create method over load
	
	public void test(int num,char ch) {
		this.num = num;
		this.ch = ch;
	}
	
	public void test(char ch,int num) {
		this.num = num;
		this.ch = ch;
	}
	
//	method Show 
	public void show() {
		System.out.println("Vlaue of Num : "+this.num+" and ch : "+ch);
	}
}

public class Question_1 {
	public static void main(String[] args) {
		Test t1 = new Test(180112,'A');
		System.out.println(t1);
		
		t1.test(180113,'P');
		t1.show();
		
		t1.test('S', 180114);
		t1.show();
	}
}


//Output:
//			Test [num=180112, ch=A]
//			Vlaue of Num : 180113 and ch : P
//			Vlaue of Num : 180114 and ch : S

