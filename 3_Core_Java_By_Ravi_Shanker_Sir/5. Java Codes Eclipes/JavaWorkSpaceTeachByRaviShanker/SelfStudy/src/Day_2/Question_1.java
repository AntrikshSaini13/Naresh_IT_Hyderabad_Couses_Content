package Day_2;


class Pro{
	
	static int x;
	
	void f1() {  // withut object  can't access that method
		x=1;
		System.out.println(x);
	}
}

public class Question_1 {
 public static void main(String[] args) {
	System.out.println("Hello Main");
	
	Pro.f1();
	
	System.out.println(Pro.x);
}
}
//
//
//  Error: Unresolved compilation problem: 
//	Cannot make a static reference to the non-static method f1() from the type Pro