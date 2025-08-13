package Mar_18_2024_Lab_Task;

enum Movie {
	Pathaan, sir, Hit, Geme_over, Lost;
	}
	public class EnumTest {
	  public static void main(String[] args) {
	    System.out.println(EnumTest.getMovie("Sir"));
	  }
	  public static Movie getMovie(String s) {
	    return Enum.valueOf(Movie.class, s.toLowerCase());
	  }
	  public static Movie getMovie(int n){
	    return Movie.values()[n];
	  }
	}