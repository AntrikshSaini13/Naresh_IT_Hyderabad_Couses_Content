package Feb_01_2024_Class_Code;

//Up-Casting is here

class Papa{
	public void love() {
		System.out.println("Love to me");
	}
}

class Son extends Papa {
	public void love() {
		System.out.println("Love to papa");
	}
}

public class Question_3 {
	public static void main(String[] args) {
		Papa p = new Papa();
		p.love();
		
		Papa p1 = new Son();
		p1.love();
	}
}

//Output : Love to me
//		 Love to papa
