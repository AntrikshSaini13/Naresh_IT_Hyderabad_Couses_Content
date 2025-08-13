package Feb_20_2024_LabCode;

//her Sir is Explain the flow of program

//@FunctionalInterface
interface Cube
{
	int cube(int b);
}
public class Main {
	
	public static void main(String[] args) {
		int a = 21;
		// Cube -> Parent Child -> Anonymous class
		// Cude cube = new Anonymous();  // Upcasting 
		Cube cube = new Cube() {
			
			@Override
			public int cube(int b) {
				return b*b*b;
			}
		};
		System.out.println(cube.cube(a));
	}
}