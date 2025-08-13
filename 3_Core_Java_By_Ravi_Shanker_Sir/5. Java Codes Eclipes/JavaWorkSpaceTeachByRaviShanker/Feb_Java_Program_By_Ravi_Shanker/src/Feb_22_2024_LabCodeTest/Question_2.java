package Feb_22_2024_LabCodeTest;

interface RiderService{
	public abstract void bookRide(String destination);
}

class Ola implements RiderService{

	@Override
	public void bookRide(String destination) {
		System.out.println("Ridding Start of Ola"+destination);
		
	}
	
	
}

class Uber implements RiderService{

	@Override
	public void bookRide(String destination) {
		System.out.println("Ridding Start of uber"+destination);
		
	}
}

class BookRide{
	public static void bookRide(RiderService ride) {
		ride.bookRide("Haridwar");
	}
}

public class Question_2 {
	public static void main(String[] args) {
		Ola o = new Ola();
		Uber u = new Uber();
		BookRide.bookRide(o);
		BookRide.bookRide(u);
	}
}
