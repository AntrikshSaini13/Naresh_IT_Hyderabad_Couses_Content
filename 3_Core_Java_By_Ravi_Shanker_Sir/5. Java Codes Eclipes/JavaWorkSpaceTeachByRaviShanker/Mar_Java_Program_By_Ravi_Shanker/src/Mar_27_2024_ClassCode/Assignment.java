package Mar_27_2024_ClassCode;

class Thread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread name is : "+Thread.currentThread());
		try {
			Thread.sleep(1000, 2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread name is : "+Thread.currentThread());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Assignment {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		t1.setName("Aman");
		
//		
		Thread2 t2 = new Thread2();
		t2.start();
		t2.setName("Antriksh");
		
	}
}
