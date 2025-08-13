package Array;

public class PassingArrayToMethod {
	public static void main(String[] args) {
		
//		Array Declarations is here
		int [] arrays = {25,36,14};
		
//		call the method and passing actual argument
		int sumArray = sum(arrays);
		
		System.out.println("Sum of array Elements : "+sumArray);
	}
	
//	this is sum method
	public static int sum(int [] arrays) {
		int sum = 0;
		for(int a : arrays) {
			System.out.println(a);
			sum+=a;
		}
		return sum;	
	}
}
