package Apr_04_2024_Lab_Test;

//Create a Counter class with a private integer variable count to store the current count value.
//
//Implement a synchronized method increment() within the Counter class. This method should increment 
//the count value by 1 and print the current count value along with the name of the thread invoking it.
//
//Implement an IncrementThread class that implements the Runnable interface.
//
//Provide a constructor for IncrementThread that accepts a Counter object as a parameter.
//
//In the run() method of IncrementThread, invoke the increment() method of the provided Counter object 
//five times in a loop.
//
//take a main class inside this In the main method of the BasicCounterProgram class:
//
//Create an instance of the Counter class.
//
//Create two threads named thread1 and thread2, initialized with instances of the IncrementThread class
//and the same Counter object.
//
//Start both threads using the start() method.

class Counter{
	private int count= 0;
	
	public synchronized  void increment() {
		for(int i = 1; i<=10;i++) {
			System.out.println("Count : "+count+" Thread Name : "+Thread.currentThread().getName());
			
			this.count++;
		}
		System.out.println("---------------------------------------------");
	}

	@Override
	public String toString() {
		return "Counter [count=" + count + "]";
	}	
}
public class Question_3 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("MAin Thread is Start");
		
		Counter c1 = new Counter(); // lock
		
		Runnable r =()->c1.increment();
		
		Thread t1 = new Thread(r,"Child 1");
		Thread t2 = new Thread(r,"Child 2");
		
		t1.start();//
		t2.start();
		System.out.println("MAin Thread Ended");
	}
}
