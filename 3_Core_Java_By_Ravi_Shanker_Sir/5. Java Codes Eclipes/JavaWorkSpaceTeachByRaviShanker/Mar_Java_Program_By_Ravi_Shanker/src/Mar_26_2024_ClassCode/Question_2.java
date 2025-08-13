package Mar_26_2024_ClassCode;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread Running");
	}
}

public class Question_2 {
	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		
//		object create here
		MyThread t1 = new MyThread();
		t1.start(); //internally call run()  method and create separate thread
//		t1.run();
		System.out.println("Main Thread is Ended");
	}
}
