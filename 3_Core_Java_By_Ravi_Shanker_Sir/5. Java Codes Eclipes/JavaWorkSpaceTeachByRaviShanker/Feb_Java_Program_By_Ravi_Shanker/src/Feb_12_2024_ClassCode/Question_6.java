package Feb_12_2024_ClassCode;

abstract class beta{
		private abstract void demo();// we can not declare private, static, final
}

class son extends beta{
	void demo() {
		System.out.println("Son");
	}
}

public class Question_6 {
	public static void main(String[] args) {
		
		beta s1 = new son();
		s1.demo();
	}
}
