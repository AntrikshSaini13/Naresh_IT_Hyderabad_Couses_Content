package Mar_16_2024_ClassCode;



public class Q {
	private enum Color{
		RED, BLUE;
		private Color() {
			
		}
		
	}

	public static void main(String[] args) {
		enum Month{
			JANUARY, FEBRUARY, MARCH, APPRIAL; //PUBLIC STAIIC FINAL
			public static void m1() {
	
			}
		}
//		System.out.println(Month.JANUARY);
//		System.out.println(Month.FEBRUARY);
//		System.out.println(Month.MARCH);
//		System.out.println(Month.APPRIAL);
//		
//		
//		System.out.println(Month.values().length);
//		System.out.println(Month.values().toString());
//		System.out.println(Month.values().hashCode());
//		System.out.println(Month.values().clone());
//		System.out.println(Month.values().getClass());
//		
		
//		Month x[] = Month.values();
//		for (int i = 0; i<x.length;i++) {
//			System.out.println(x[i]);
//		}
		
		Month y[] = Month.values();
		
		for(Month z : y ) {
			System.out.println(z);
		}
		
//		Month a[] = Month.values();
//		
//		for(Month b : a ) {
//			System.out.println(b.ordinal());
//		}
		
	}
}
