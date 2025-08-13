package Mar_26_2024_ClassCode;

public class Question_1 {
	public static void main(String[] args) {
//		here we are call the predefine method  currentthread() by using class reference
		Thread t = Thread.currentThread();
		System.out.println(t);
//		        OR
		String nameOfThread = Thread.currentThread().getName();
		System.out.println(nameOfThread);
	}
}


//Output: 
//	Thread[#1,main,5,main]
//			main