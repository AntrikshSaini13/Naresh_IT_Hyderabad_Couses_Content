package Mar_30_2024_Lab_Task;

import java.util.Scanner;

//Write a program in java to show the drawback of Multithreading by booking Railway Reservation System.
//
//In this scenario, only 1 seat is available and two threads are accessing this seat to book the ticket. 
//
//Write a Program to show that both the thread will get the ticket.

class  RailwayReservationSystem1 {
	private int seat =1;
	private int userId;
	private String userName;
	private long seatNumber;	 
	
//constructor
	public RailwayReservationSystem1(int userId, String userName, long seatNumber) {
		super();
		this.userId =userId;
		this.userName = userName;
		this.seatNumber = seatNumber;
	}	

	public int getSeat() {
		return seat;
	}
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public long getSeatNumber() {
		return seatNumber;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	@Override
	public String toString() {
		return "RailwayReservationSystem [seat=" + seat + ", userId=" + userId + ", userName=" + userName
				+ ", seatNumber=" + seatNumber + "]";
	}

	public void seatAlloate() {
		if(0<seat) {
			
			System.out.println("Seat avaliable now : "+seat);
			
			System.out.println("Id : "+userId+"\nName : "+userName+"\nSeat Number : "+seatNumber);
			System.out.println("Seat resurve sucessfully");
			
			seat-=1;
			System.out.println(""
					+ "After the booking Ticket seat avaliable now : "+seat);
		}
		else {
			System.out.println("\nSeat is not availabe");
		}
	}	 
}

class User implements Runnable{
	public void  run() {
		 Thread t = Thread.currentThread();

		 RailwayReservationSystem1 ticket = new RailwayReservationSystem1(1,t.getName(),t.getId());
		 ticket.seatAlloate();
	}
}

public class Question_2 {
	public static void main(String[] args) throws InterruptedException {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many Objects (Person Tickets) you wants : ");
		int countOfObject = sc.nextInt();
		
		for(int i=1; i<=countOfObject;i++) {
			
			System.out.print("\nEnter name Of Threads (Person) : ");
			String nameOfTHread = sc.next();
//			nameOfTHread = sc.next();
			
			Thread t1 = new Thread(new User(),nameOfTHread);
			t1.start();	
			t1.join();
		}
		sc.close();
	}
}
