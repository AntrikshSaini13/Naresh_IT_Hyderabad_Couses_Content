package Mar_30_2024_ClassCode;

class RailwayReservation{
	int totalSeat;
	int getSeat;
//	int userId;
//	String userName;
	
	public RailwayReservation(int totalSeat, int getSeat) {
		super();
		this.totalSeat = totalSeat;
		this.getSeat = getSeat;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public int getGetSeat() {
		return getSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public void setGetSeat(int getSeat) {
		this.getSeat = getSeat;
	}
		
}

public class Questipn_2 {
	public static void main(String[] args) {
		RailwayReservation r1 = new RailwayReservation(1,1);
		
		Runnable run = ()->{
			String name = null;
			long seatNum = 0;
			if(r1.getSeat <= r1.totalSeat) {
				name = Thread.currentThread().getName();
				seatNum = Thread.currentThread().getId();
				System.out.println("Seat Number is : "+seatNum+" name of User : "+name);
				r1.totalSeat-=r1.getSeat;
			}
			else {
				System.out.println("Sear is not available");
			}
		};
		Thread t1 = new Thread(run,"Aman");
		Thread t2 = new Thread(run,"ANtriksh");
		
		t1.start();
		t2.start();
		
		new Thread(()->{
			String name = null;
			long seatNum = 0;
			if(r1.getSeat <= r1.totalSeat) {
				name = Thread.currentThread().getName();
				seatNum = Thread.currentThread().getId();
				System.out.println("Seat Number is : "+seatNum+" name of User : "+name);
				r1.totalSeat-=r1.getSeat;
			}
			else {
				System.out.println("Sear is not available");
			}
		},"prachi").start();;
	}
}
