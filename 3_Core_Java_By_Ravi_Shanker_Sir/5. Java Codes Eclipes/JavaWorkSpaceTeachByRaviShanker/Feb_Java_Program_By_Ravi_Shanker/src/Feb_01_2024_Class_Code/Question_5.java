package Feb_01_2024_Class_Code;

class MummyPapa{
	public void genatic() {
		System.err.println("main");
	}
}

class Son1 extends MummyPapa{
	public void genatic() {
		System.out.println("We are Belong to Mummy Papa");
	}
}

class Daughter extends MummyPapa{
	public void genatic() {
		System.out.println("We are Belong to Mummy Papa");
	}
}

public class Question_5 {
	public static void main(String[] args) {
		MummyPapa m1;
		
		m1 = new Son1();
		m1.genatic();
		
		m1 = new Daughter();
		m1.genatic();
	}
}
