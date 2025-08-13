package Mar_30_2024_Lab_Task;

//Write a program in java to show the drawback of Multithreading by booking Railway Reservation System.
//
//In this scenario, only 1 seat is available and two threads are accessing this seat to book the ticket. 
//
//Write a Program to show that both the thread will get the ticket.

class  RailwayReservationSystem {
	private int seat =1;
	private int userId;
	private String userName;
	private long seatNumber;	 
	
// constructor
	public RailwayReservationSystem(int userId, String userName, long seatNumber) {
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
			System.out.println("After the booking Ticket seat avaliable now : "+seat);
		}
		else {
			System.out.println("Seat is not availabe");
		}
	}
	 
}

class Aman implements Runnable{
	 public void  run() {
		 Thread t = Thread.currentThread();
//		 System.out.println(t.getName());
//		 Syst;em.out.println(t.getId());
		 RailwayReservationSystem ticket = new RailwayReservationSystem(1,t.getName(),t.getId());
		 ticket.seatAlloate();
		 
	 }
}
class Antriksh implements Runnable{
	public void  run() {
		 Thread t = Thread.currentThread();
//		 System.out.println(t.getName());
//		 System.out.println(t.getId());
		 RailwayReservationSystem ticket = new RailwayReservationSystem(2,t.getName(),t.getId());
		 ticket.seatAlloate();
	}
}

public class Question_1 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Aman(),"Aman");
		t1.start();
		
		Thread t2 = new Thread(new Antriksh(),"Antriksh");
		t2.start();
	}
}
