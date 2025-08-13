package Feb_29_2024_LabCodeTest;

interface I1 {
String m1();
}
interface I2 {
String m1( );
}

class A1 implements I1,I2 {
	@Override
	public Object m1() {
		System.out.println("m1");
		return new Object();
	}
}

public class TestMcq {
	public static void main(String[] args) {
		A1 a = new A1();
		a.m1();
	}
}


